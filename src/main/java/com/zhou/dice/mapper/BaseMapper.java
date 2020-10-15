package com.zhou.dice.mapper;

import com.baomidou.mybatisplus.core.mapper.Mapper;

import java.util.List;

public interface BaseMapper<T>extends Mapper<T> {

    public List getBySome(T a);

    public int add(T a);

    public int update(T a);

    public int delete(T a);

}
