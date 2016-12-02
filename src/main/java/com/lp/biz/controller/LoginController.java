package com.lp.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by CPR161 on 2016-12-02.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

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



        return null;
    }


}
