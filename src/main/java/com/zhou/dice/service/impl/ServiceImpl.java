package com.zhou.dice.service.impl;

import com.zhou.dice.mapper.BaseMapper;
import com.zhou.dice.service.ComSV;

import java.util.List;

public class ServiceImpl <M extends BaseMapper<T>, T> implements ComSV<T> {
    @Override
    public List<T> getBySome(T a) {
        return null;
    }

    @Override
    public int add(T a) {
        return 0;
    }

    @Override
    public int update(T a) {
        return 0;
    }

    @Override
    public int delete(T a) {
        return 0;
    }
}
