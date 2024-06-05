package com.mpanmall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.common.utils.Query;

import com.mpanmall.warehouse.dao.WarehouseOrderTaskDetailDao;
import com.mpanmall.warehouse.entity.WarehouseOrderTaskDetailEntity;
import com.mpanmall.warehouse.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WarehouseOrderTaskDetailDao, WarehouseOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WarehouseOrderTaskDetailEntity> page = this.page(
                new Query<WarehouseOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WarehouseOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}