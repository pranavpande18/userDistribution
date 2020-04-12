package com.demoapp.demo;

import com.demoapp.demo.controller.AdminController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	AdminController adminController;

	@Test
	void contextLoads() {
		Assertions.assertThat(adminController).isNotNull();
	}

}
