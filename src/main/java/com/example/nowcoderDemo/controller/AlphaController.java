//package com.example.nowcoderDemo.controller;
//
//import com.example.nowcoderDemo.service.AlphaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Enumeration;
//
///**
// * @Author: ljp
// * @Time: 2022-03-23 18:58
// */
//
//@Controller
//@RequestMapping("/alpha")
//public class AlphaController {
//
//    @Autowired
//    private AlphaService alphaService;
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    public String saveHello(){
//        return "Hello Spring Boot!";
//    }
//
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public String getData() {
//        return alphaService.find();
//    }
//
//    @RequestMapping("/httpTest")
//    public void httpTest(HttpServletRequest request, HttpServletResponse response) {
//        //获取请求数据
//        System.out.println(request.getMethod());
//        System.out.println(request.getServletPath());
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            String name = headerNames.nextElement();
//            String value = request.getHeader(name);
//            System.out.println(name + ":" + value);
//        }
//        System.out.println(request.getParameter("code"));
//
//        //获取请求数据
//        response.setContentType("text/html;charset=utf-8");
//        try (PrintWriter writer = response.getWriter();) {
//            writer.write("<h1>牛客网<h1>");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
