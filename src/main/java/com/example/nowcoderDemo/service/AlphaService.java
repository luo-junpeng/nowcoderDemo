package com.example.nowcoderDemo.service;

import com.example.nowcoderDemo.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: ljp
 * @Time: 2022-03-24 15:45
 */
//@Service
//@Scope("singleton")//prototype:多实例
//public class AlphaService {
//
//    @Autowired
//    @Qualifier("alphaHibernate")
//    private AlphaDao alphaDao;
//
//    public AlphaService() {
//        System.out.println("实例化AlphaServie");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("初始化AlphaService");
//    }
//
//
//    @PreDestroy
//    public void destory() {
//        System.out.println("销毁AlphaService");
//    }
//
//    public String find() {
//        return alphaDao.select();
//    }
//}
