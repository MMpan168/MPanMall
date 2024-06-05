package com.mpanmall.warehouse.dao;

import com.mpanmall.warehouse.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-11-17 13:50:10
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
