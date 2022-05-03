package com.example.nowcoderDemo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Author: ljp
 * @Time: 2022-03-24 15:40
 */
@Repository
@Primary//相同bean，这个有更高的优先级
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
