package com.mpanmall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.common.utils.Query;

import com.mpanmall.warehouse.dao.WarehouseOrderTaskDao;
import com.mpanmall.warehouse.entity.WarehouseOrderTaskEntity;
import com.mpanmall.warehouse.service.WareOrderTaskService;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WarehouseOrderTaskDao, WarehouseOrderTaskEntity> implements WareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WarehouseOrderTaskEntity> page = this.page(
                new Query<WarehouseOrderTaskEntity>().getPage(params),
                new QueryWrapper<WarehouseOrderTaskEntity>()
        );

        return new PageUtils(page);
    }

}