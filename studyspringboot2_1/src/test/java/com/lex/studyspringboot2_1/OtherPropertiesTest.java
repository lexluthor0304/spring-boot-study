package com.lex.studyspringboot2_1;

import com.lex.studyspringboot2_1.config.OtherProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OtherPropertiesTest {

    @Resource
    private OtherProperties properties;

    @Test
    public void testOther() throws Exception {
        System.out.println("titel:" + properties.getTitle());
        System.out.println("description:" + properties.getDescription());
    }
}
