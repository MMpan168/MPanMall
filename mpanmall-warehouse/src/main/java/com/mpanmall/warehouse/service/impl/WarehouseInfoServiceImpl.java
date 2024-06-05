package com.mpanmall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.common.utils.Query;

import com.mpanmall.warehouse.dao.WarehouseInfoDao;
import com.mpanmall.warehouse.entity.WarehouseInfoEntity;
import com.mpanmall.warehouse.service.WarehouseInfoService;
import org.springframework.util.StringUtils;


@Service("wareInfoService")
public class WarehouseInfoServiceImpl extends ServiceImpl<WarehouseInfoDao, WarehouseInfoEntity> implements WarehouseInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        QueryWrapper<WarehouseInfoEntity> wareInfoEntityQueryWrapper = new QueryWrapper<>();
        String key = (String) params.get("key");
        if(!StringUtils.isEmpty(key)){
            wareInfoEntityQueryWrapper.eq("id",key).or()
                    .like("name",key)
                    .or().like("address",key)
                    .or().like("areacode",key);
        }

        IPage<WarehouseInfoEntity> page = this.page(
                new Query<WarehouseInfoEntity>().getPage(params),
                wareInfoEntityQueryWrapper
        );

        return new PageUtils(page);
    }

}