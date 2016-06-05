package com.basic.springmvc.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dello on 2016/6/5.
 */
@Controller
public class WebController extends BaseController {

    private Logger logger= LoggerFactory.getLogger(WebController.class);

    @RequestMapping("/")
    public String hello(){
            return "index";
    }

    @RequestMapping("/user/viewAll")
    public ModelAndView viewAll(@RequestParam String name,@RequestParam String password){
        ModelAndView modelAndView=new ModelAndView();
        logger.info("name: "+name);
        logger.info("password: "+password);
        System.out.println("name: "+name);
        modelAndView.setViewName("hello");
        modelAndView.addObject("name",name);
        modelAndView.addObject("password",password);
        return modelAndView;
    }
}
