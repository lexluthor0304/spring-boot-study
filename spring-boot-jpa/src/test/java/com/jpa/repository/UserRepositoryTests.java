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
    public void testSave() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("aa", "aa123456", "aa@gmail.com", "a1", formattedDate));
        userRepository.save(new User("bb", "bb123456", "bb@gmail.com", "b1", formattedDate));
        userRepository.save(new User("cc", "cc123456", "cc@gmail.com", "c1", formattedDate));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("b1", userRepository.findByUserNameOrEmail("bb", "bb@gmail.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));

        }
    }
