package com.lp.common.service;

import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-06.
 * 采用抽象工程的设计模式
 */
public interface IBaseService<T> {
    void addEntity(T t);

    void deleteByKey(Object key);

    List<T> getList(Map<String,Object> cond);

    void updateEntity(T t);

    void batchInsert(List<T> list);
}
