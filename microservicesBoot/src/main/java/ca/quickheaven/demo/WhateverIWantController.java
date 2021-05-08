package ca.quickheaven.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WhateverIWantController {

    @RequestMapping("/hi/{name}")
    public String hiThere(Map model, @PathVariable String name) {
        model.put("name", name);
        return "hello";
    }
}
