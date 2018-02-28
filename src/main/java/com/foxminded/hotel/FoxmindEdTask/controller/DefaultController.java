package com.foxminded.hotel.FoxmindEdTask.controller;

import com.foxminded.hotel.FoxmindEdTask.model.User;
import com.foxminded.hotel.FoxmindEdTask.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 28.02.2018.
 */

@Controller
public class DefaultController  {

    private final IUserService userService;

    @Autowired
    public DefaultController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @GetMapping("/addUserPage")
    public ModelAndView addUserPage(){
        return new ModelAndView("addUser");
    }


    @GetMapping("/newUser")
   public ModelAndView newUser(HttpServletRequest request){
        String name = request.getParameter("name");
        User newUser = new User(name);
        userService.addUser(newUser);
        Map<String,String> model = new HashMap<>();
        model.put("user",name);
        return new ModelAndView("index",model);
    }

}
