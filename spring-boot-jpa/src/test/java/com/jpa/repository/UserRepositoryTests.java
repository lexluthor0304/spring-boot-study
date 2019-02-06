package com.jpa.repository;

import com.jpa.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Resource
    private UserRepository userRepository;

    @Test
    public void test() {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User(1l,"aa", "aa123456","aa@gmail.com","aa123456",formattedDate));
        userRepository.save(new User(2l,"bb", "bb123456","bb@gmail.com","bb123456",formattedDate));
        userRepository.save(new User(3l,"cc", "cc123456","cc@gmail.com","cc123456",formattedDate));

        Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@gmail.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aal"));

        }
    }
