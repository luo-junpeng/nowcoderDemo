package com.example.nowcoderDemo.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: ljp
 * @Time: 2022-03-24 15:36
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
