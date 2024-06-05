package com.mpanmall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.warehouse.entity.WarehouseOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:59:40
 */
public interface WareOrderTaskDetailService extends IService<WarehouseOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

