package com.mpanmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:47:05
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

