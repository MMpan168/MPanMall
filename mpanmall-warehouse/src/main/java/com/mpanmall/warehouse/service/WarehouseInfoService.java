package com.mpanmall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.warehouse.entity.WarehouseInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:59:40
 */
public interface WarehouseInfoService extends IService<WarehouseInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

