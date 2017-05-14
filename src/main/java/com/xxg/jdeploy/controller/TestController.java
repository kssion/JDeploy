package com.xxg.jdeploy.controller;

import com.xxg.jdeploy.service.JavaHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * 主机功能测试
 * Created by Chance on 2017/5/13.
 */
@Controller
@RequestMapping("hosts")
public class TestController {

    @Autowired
    private JavaHostService javaHostService;

    @Value("${modules}")
    private String modules;

    /**
     * 主机列表展示页面
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView("hosts/test");
        mv.addObject("javaHostList", javaHostService.getHosts());
        return mv;
    }

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
//        ModelAndView mv = new ModelAndView("hosts/list");
//        mv.addObject("uuid", uuid);
//        return mv;

        ModelAndView mv = new ModelAndView("hosts/list");

        List<String> moduleList = Arrays.asList(modules.split(","));
        mv.addObject("moduleList", moduleList);
        mv.addObject("javaHostApps", javaHostService.getHostApps(uuid));
        return mv;
    }


}
