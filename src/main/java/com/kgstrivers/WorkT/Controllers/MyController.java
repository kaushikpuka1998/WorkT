package com.kgstrivers.WorkT.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String saynew()
    {
        System.out.println("HELLO WELCOME TO MY CONTROLLER");
        return "HI FOLKS";
    }
}
