package com.co.tmk.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.co.tmk.test.service.TestService;
import com.co.tmk.test.vo.TestVo;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/testMain.do", method= {RequestMethod.GET, RequestMethod.POST})
    public String testMain(Model model){
        TestVo testVo = testService.testSelect();
        String testCol = testVo.getTestCol();
        System.out.println("testCol: " + testCol);
        model.addAttribute("test",testCol);
        return "test/testMain";
    }

    @RequestMapping(value = "/ajaxTest.do", produces = "application/text; charset=utf8", method=RequestMethod.POST)
    @ResponseBody
    public String ajaxTest(Model model){
        String test = testService.testAjax();

        return test;
    }

    @RequestMapping(value = "/jsonTest.do", method=RequestMethod.POST)
    public String jsonTest(Model model, @RequestBody TestVo vo){
        System.out.println("Json객체 형태로 받아온 데이터: " + vo.getTestCol());
        model.addAttribute("key",testService.testJson());
        return "JSON_VIEW";
    }
}
