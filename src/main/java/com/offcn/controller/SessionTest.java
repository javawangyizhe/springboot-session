package com.offcn.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionTest {
    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","Hello");
        return "OK";
    }
    @GetMapping("/get")
    public String getSession(HttpSession session){
        String o =(String) session.getAttribute("msg");
        return o;
    }
}
