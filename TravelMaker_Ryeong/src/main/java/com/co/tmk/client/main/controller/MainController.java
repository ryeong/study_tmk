package com.co.tmk.client.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @RequestMapping(value = "/")
    public String main() {
        return "client/main/main";
    }
}
