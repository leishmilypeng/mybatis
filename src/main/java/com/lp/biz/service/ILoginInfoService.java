package com.lp.biz.service;

import com.lp.common.dao.TmLoginInfo;
import com.lp.common.service.IBaseService;

import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-05.
 */
public interface ILoginInfoService extends IBaseService<TmLoginInfo>{

    TmLoginInfo getLoginInfoById(Long id);

    void addLoginInfo(TmLoginInfo info);

    List<TmLoginInfo> getLoginInfoList(Map<String,Object> cond);

    void delByKey(Long id);

    long getLoginInfoCount(Map<String,Object> cond);

}
