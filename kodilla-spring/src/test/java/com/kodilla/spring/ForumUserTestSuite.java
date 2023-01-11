package com.kodilla.spring;


import com.kodilla.spring.forum.ForumUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ForumUser.class)
public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumuser = context.getBean(ForumUser.class);
        //When
        //Then
        assertEquals("John Smith", forumuser.username);
    }

}
