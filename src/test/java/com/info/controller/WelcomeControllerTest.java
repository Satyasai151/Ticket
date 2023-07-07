package com.info.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.info.service.WelcomeService;

@WebMvcTest(value=WelcomeController.class)
public class WelcomeControllerTest {
	@MockBean
	private WelcomeService  welcomeService;
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void welcomeTest() throws Exception {
		
		when(welcomeService.getMessage()).thenReturn("welcome to suresh");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
		
		
	}

}
