package com.alayon.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PostControllerIntTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void postPostObject_WhenPostObjectIsOk_ReceiveOkStatus() {
		// given
		// when
		// then
	}
}
