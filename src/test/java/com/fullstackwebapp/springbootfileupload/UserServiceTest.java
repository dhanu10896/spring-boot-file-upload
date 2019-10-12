package com.fullstackwebapp.springbootfileupload;

import com.fullstackwebapp.springbootfileupload.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootFileUploadApplication.class})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetuser() {
        Assert.assertEquals(userService.getUser(), "Tom");
    }

}
