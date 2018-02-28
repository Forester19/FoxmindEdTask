package com.foxminded.hotel.FoxmindEdTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 28.02.2018.
 */

@Controller
public class DefaultController  {
    @GetMapping("/")
    public ModelAndView index(){
        Map<String, String > model = new HashMap<>();
        model.put("user", "VOva");
        return new ModelAndView("index",model);
    }


}
