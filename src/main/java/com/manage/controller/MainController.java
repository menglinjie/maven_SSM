package com.manage.controller;

import com.manage.model.Person;
import com.manage.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by XRog
 * On 2/1/2017.12:36 AM
 */
@Controller
@RequestMapping("/user")
public class MainController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam("name") String name,
                              @RequestParam("age") int age,
                              HttpServletRequest request) {
        Person person = testService.login(name, age);
        if (person == null) {
            ModelAndView modelAndView = new ModelAndView("loginError", "username", name);
            return modelAndView;
        }
        request.getSession().setAttribute("user", person);
        ModelAndView modelAndView = new ModelAndView("loginSuccess");
        return modelAndView;
    }

}