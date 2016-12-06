package com.lp.biz.controller;

import com.lp.biz.service.ILoginInfoService;
import com.lp.common.dao.Result;
import com.lp.common.dao.TmLoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-02.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ILoginInfoService loginInfoService;

    @RequestMapping(value="/index.do")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){

        String sessionId = request.getSession().getId();
        System.out.println(sessionId);

        ModelAndView mv = new ModelAndView("index");

        return mv;
    }

    @RequestMapping(value="/getLoginInfo.do")
    @ResponseBody
    public Object getLoginInfo(HttpServletRequest request, HttpServletResponse response){

        Result result = new Result("调用成功！",true);
        TmLoginInfo loginInfo = loginInfoService.getLoginInfoById(Long.valueOf(1));
        if(loginInfo!=null){
            System.out.println();
        }
        return result;
    }


    @RequestMapping(value="/addLoginInfo.do")
    @ResponseBody
    public Result addLoginInfo(HttpServletRequest request, HttpServletResponse response){

        Result result = new Result("调用成功！",true);
        Map<String,Object> cond = new HashMap<String,Object>();
        cond.put("orderBy","create_date desc");
        List<TmLoginInfo> infos = loginInfoService.getLoginInfoList(cond);

        TmLoginInfo info;
        if(infos!=null&&infos.size()>0){
            info =infos.get(0);
            Long id = info.getId()+1;
            info.setId(id);
            info.setUserCode("lei"+id);
            info.setUserName("peng"+id);
            info.setUserPass("123456");
            info.setCreateDate(new Timestamp(System.currentTimeMillis()));
            info.setCreateBy(Long.valueOf(1));
        }else{
            info = new TmLoginInfo();
            long id = 1;
            info.setId(id);
            info.setUserCode("lei"+id);
            info.setUserName("peng"+id);
            info.setUserPass("123456");
            info.setCreateDate(new Timestamp(System.currentTimeMillis()));
            info.setCreateBy(Long.valueOf(1));
        }

        loginInfoService.addLoginInfo(info);
        return result;
    }


    @RequestMapping(value="/delLoginInfo.do")
    @ResponseBody
    public Result delLoginInfo(HttpServletRequest request, HttpServletResponse response){

        Result result = new Result("删除成功！",true);
        Map<String,Object> cond = new HashMap<String,Object>();
        cond.put("orderBy","create_date asc");
        List<TmLoginInfo> infos = loginInfoService.getLoginInfoList(cond);

        TmLoginInfo info;
        if(infos!=null&&infos.size()>0){
            info =infos.get(0);
            Long id = info.getId();
            loginInfoService.delByKey(id);
        }

        long cnt = loginInfoService.getLoginInfoCount(cond);
        String msg = "表中剩余条数"+cnt;
        result.setMessage(msg);
        return result;
    }

}
