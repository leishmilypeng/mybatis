package com.lp.common.service.impl;

import com.lp.common.service.IBaseService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-06.
 */
public class BaseServiceImpl<T extends Serializable> implements IBaseService<T> {

    public void addEntity(T o) {

    }

    public void deleteByKey(Object key) {

    }

    public void updateEntity(T o) {

    }

    @Override
    public void batchInsert(List<T> list) {

    }

    public List getList(Map<String,Object> cond) {
        return null;
    }
}
