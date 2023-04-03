package com.rystars.mall.admin;

import com.rystars.mall.admin.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAdminApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		String hello = helloController.hello();
		System.out.println(hello);

	}

}
