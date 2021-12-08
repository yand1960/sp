package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
//@Scope("prototype")
public class MyMVCController {

    @Autowired
    CounterBean counter;

    @RequestMapping("/time")
    public String time(Model model) {
        var now = (new Date()).toString();
        model.addAttribute("now",now);
        return "time"; //имя предстваления (ThymeLeaf должен быть подключен)
    }

    @RequestMapping("/count")
    @ResponseBody
    public String counter(Model model) {
        return "" + counter.incAndGet();
    }


}
