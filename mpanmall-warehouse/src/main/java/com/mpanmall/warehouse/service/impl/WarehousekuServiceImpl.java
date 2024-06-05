package com.mpanmall.warehouse.service.impl;

import com.mpanmall.common.utils.R;
import com.mpanmall.warehouse.feign.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.common.utils.Query;

import com.mpanmall.warehouse.dao.WarehouseSkuDao;
import com.mpanmall.warehouse.entity.WarehouseSkuEntity;
import com.mpanmall.warehouse.service.WarehousekuService;
import org.springframework.util.StringUtils;


@Service("wareSkuService")
public class WarehousekuServiceImpl extends ServiceImpl<WarehouseSkuDao, WarehouseSkuEntity> implements WarehousekuService {

    @Autowired
    WarehouseSkuDao warehouseSkuDao;

    @Autowired
    ProductFeignService productFeignService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        /**
         * skuId: 1
         * wareId: 2
         */
        QueryWrapper<WarehouseSkuEntity> queryWrapper = new QueryWrapper<>();
        String skuId = (String) params.get("skuId");
        if(!StringUtils.isEmpty(skuId)){
            queryWrapper.eq("sku_id",skuId);
        }

        String wareId = (String) params.get("wareId");
        if(!StringUtils.isEmpty(wareId)){
            queryWrapper.eq("ware_id",wareId);
        }


        IPage<WarehouseSkuEntity> page = this.page(
                new Query<WarehouseSkuEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public void addStock(Long skuId, Long wareId, Integer skuNum) {
        //1、判断如果还没有这个库存记录新增
        List<WarehouseSkuEntity> entities = warehouseSkuDao.selectList(new QueryWrapper<WarehouseSkuEntity>().eq("sku_id", skuId).eq("ware_id", wareId));
        if(entities == null || entities.size() == 0){
            WarehouseSkuEntity skuEntity = new WarehouseSkuEntity();
            skuEntity.setSkuId(skuId);
            skuEntity.setStock(skuNum);
            skuEntity.setWareId(wareId);
            skuEntity.setStockLocked(0);
            //TODO 远程查询sku的名字，如果失败，整个事务无需回滚
            //1、自己catch异常
            //TODO 还可以用什么办法让异常出现以后不回滚？高级
            try {
                R info = productFeignService.info(skuId);
                Map<String,Object> data = (Map<String, Object>) info.get("skuInfo");

                if(info.getCode() == 0){
                    skuEntity.setSkuName((String) data.get("skuName"));
                }
            }catch (Exception e){

            }


            warehouseSkuDao.insert(skuEntity);
        }else{
            warehouseSkuDao.addStock(skuId,wareId,skuNum);
        }

    }

}