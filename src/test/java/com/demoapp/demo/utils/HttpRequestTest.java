package com.demoapp.demo.utils;

import com.demoapp.demo.ApplicationConstants;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest{

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate restTemplate;

    public void tryTest(){
        System.out.println(this.restTemplate.getRootUri());
    }
}
