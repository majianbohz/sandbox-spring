package com.yinyu;

import com.yinyu.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MyaopApplication.class)
class MyaopApplicationTests {

	@Autowired
	UserController userController;

	@Test
	void contextLoads() {
		userController.testAOP("zhangsan", "123456");
	}

	@Test
	public void testAOP1(){
	}

}
