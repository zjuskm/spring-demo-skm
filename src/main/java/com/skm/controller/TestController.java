package com.skm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("test/test");
        modelAndView.addObject("msg", "hello, friend!");
        return modelAndView;
    }
}
