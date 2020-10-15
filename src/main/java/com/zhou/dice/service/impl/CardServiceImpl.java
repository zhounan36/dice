package com.zhou.dice.service.impl;

import com.zhou.dice.entity.Card;
import com.zhou.dice.mapper.CardMapper;
import com.zhou.dice.service.ICardService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements ICardService {

}
