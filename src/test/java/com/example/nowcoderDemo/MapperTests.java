package com.example.nowcoderDemo;

import com.example.nowcoderDemo.dao.DiscussPostMapper;
import com.example.nowcoderDemo.dao.UserMapper;
import com.example.nowcoderDemo.entity.DiscussPost;
import com.example.nowcoderDemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @Author: ljp
 * @Time: 2022-03-26 17:28
 */
@SpringBootTest
@ContextConfiguration(classes = NowcoderDemoApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost post : discussPosts) {
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }


}
