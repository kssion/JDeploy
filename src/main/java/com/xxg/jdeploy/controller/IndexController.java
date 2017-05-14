package com.xxg.jdeploy.controller;

import com.xxg.jdeploy.service.JavaHostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private JavaHostService javaWebDeployService;

    /**
     * 主机列表展示页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("javaHostList", javaWebDeployService.getHosts());
        return mv;
    }

}
