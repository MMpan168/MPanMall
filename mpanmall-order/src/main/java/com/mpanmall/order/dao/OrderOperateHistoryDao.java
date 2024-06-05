package com.mpanmall.order.dao;

import com.mpanmall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:56:16
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
