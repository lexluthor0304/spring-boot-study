package com.lex.studyspringboot2_1;

import com.lex.studyspringboot2_1.config.NeoProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NeoPropertiesTest {


    @Resource
    private NeoProperties properties;

    @Test
    public void testMore() throws Exception {
        System.out.println("title:" + properties.getTitle());
        System.out.println("description:" + properties.getDescription());
    }
}
