package com.lp.common.dao;

import com.lp.common.mapper.TmLoginInfo;

/**
 * Created by CPR161 on 2016-12-05.
 */
public interface ITmLoginInfoDao {
    TmLoginInfo getLoginInfoById(Long id);

}
