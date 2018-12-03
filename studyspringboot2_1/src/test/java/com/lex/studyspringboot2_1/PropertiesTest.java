package com.lex.studyspringboot2_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${studyspringboot2_1.title}")
    private String title;

    @Test
    public void testSingle() {
        Assert.assertEquals(title, "スプリング勉強");
    }
}
