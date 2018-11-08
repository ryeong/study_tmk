package com.co.tmk.common.error.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/error")
public class ErrorHandlerController
{
    @RequestMapping(value = "/err404")
    public String err404() {
        return "common/error/err404";
    }

    @RequestMapping(value = "/err500")
    public String err500() {
        return "common/error/err500";
    }
}
