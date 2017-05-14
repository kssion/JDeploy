package com.xxg.jdeploy.controller;

import com.xxg.jdeploy.service.JavaHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 虚拟主机
 * Created by Chance on 2017/5/14.
 */
@Controller
@RequestMapping("hosts")
public class JavaHostsController {

    @Autowired
    private JavaHostService javaHostService;

    /**
     * 添加项目页面
     */
    @RequestMapping(value = "new", method = RequestMethod.GET)
    public ModelAndView newService() {
        ModelAndView mv = new ModelAndView("hosts/new");
        return mv;
    }

    /**
     * 列表页面
     */
    @RequestMapping(value = "{uuid}", method = RequestMethod.GET)
    public ModelAndView list(@PathVariable String uuid) {
        ModelAndView mv = new ModelAndView("hosts/list");
        mv.addObject("javaHostApps", javaHostService.getHostApps(uuid));
        return mv;
    }
}
