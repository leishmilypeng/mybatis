package com.lp.common.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-05.
 */
public interface ITmLoginInfoDao {
    TmLoginInfo getLoginInfoById(Long id);

    void addLoginInfo(TmLoginInfo info);

    List<TmLoginInfo> getLoginInfoList(Map<String,Object> cond);

    void delByKey(Long id);

    long getLoginInfoCount(Map<String,Object> cond);
}
