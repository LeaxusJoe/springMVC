package com.leaxus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leaxus on 2016/9/28.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)  method指定请求方式
    public ModelAndView index(@RequestParam(defaultValue = "fucking demo", required = false) String user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        //将参数返回给页面
        modelAndView.addObject("user",user);
        return modelAndView;
    }

}
