package com.xxg.jdeploy.controller;

import com.xxg.jdeploy.service.JavaHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主机功能测试
 * Created by Chance on 2017/5/13.
 */
@Controller
public class TestController {

    @Autowired
    private JavaHostService javaHostService;

    /**
     * 主机列表展示页面
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView("test");
        mv.addObject("javaHostList", javaHostService.getHosts());
        return mv;
    }
}
