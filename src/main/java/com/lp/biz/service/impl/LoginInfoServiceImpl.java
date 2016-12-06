package com.lp.biz.service.impl;

import com.lp.biz.service.ILoginInfoService;
import com.lp.common.dao.ITmLoginInfoDao;
import com.lp.common.dao.TmLoginInfo;
import com.lp.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CPR161 on 2016-12-05.
 */
@Service
public class LoginInfoServiceImpl extends BaseServiceImpl<TmLoginInfo> implements ILoginInfoService  {

    @Autowired
    private ITmLoginInfoDao loginInfoDao;

    public TmLoginInfo getLoginInfoById(Long id) {
        return loginInfoDao.getLoginInfoById(id);
    }

    @Override
    public void addLoginInfo(TmLoginInfo info) {
        loginInfoDao.addLoginInfo(info);
    }

    @Override
    public List<TmLoginInfo> getLoginInfoList(Map<String, Object> cond) {
        return loginInfoDao.getLoginInfoList(cond);
    }

    @Override
    public void delByKey(Long id) {
        loginInfoDao.delByKey(id);
    }

    @Override
    public long getLoginInfoCount(Map<String, Object> cond) {
        return loginInfoDao.getLoginInfoCount(cond);
    }


}
