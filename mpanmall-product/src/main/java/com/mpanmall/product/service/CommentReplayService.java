package com.mpanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-01 21:08:48
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

