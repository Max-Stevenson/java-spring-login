package com.makers.springbootsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showhome(){
        return("homepage");
    }
}
