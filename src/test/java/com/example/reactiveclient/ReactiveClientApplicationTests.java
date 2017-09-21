//package com.example.reactiveclient;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.reactive.server.WebTestClient;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ReactiveClientApplicationTests {
//
//	private WebTestClient webTestclient;
//	
//	@Before
//	public void before()
//	{
//		this.webTestclient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
//	}
//	
//	@Test
//	public void testClient() {
//		this.webTestclient.get().uri("/events/42").accept(MediaType.APPLICATION_JSON_UTF8)
//		.exchange().expectStatus().isOk();
//	}
//
//}
