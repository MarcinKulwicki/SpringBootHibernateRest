package com.marcinkulwicki.testSpringBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/body")
    @ResponseBody
    public String body(){
        return "body body body";
    }

    @RequestMapping("/simple")
    public String simple(){

        return "/WEB-INF/jsp/simple.jsp";
    }

}
