package com.lp.biz.service.impl;

import com.lp.biz.service.ILoginInfoService;
import com.lp.common.dao.ITmLoginInfoDao;
import com.lp.common.mapper.TmLoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by CPR161 on 2016-12-05.
 */
@Service
public class LoginInfoServiceImpl implements ILoginInfoService {

    @Autowired
    private ITmLoginInfoDao loginInfoDao;

    public TmLoginInfo getLoginInfoById(Long id) {
        return loginInfoDao.getLoginInfoById(id);
    }
}
