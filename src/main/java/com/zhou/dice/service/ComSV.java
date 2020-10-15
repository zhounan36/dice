package com.zhou.dice.service;

import java.util.List;

public interface ComSV<T> {

    public List<T> getBySome(T a);

    public int add(T a);

    public int update(T a);

    public int delete(T a);


}
