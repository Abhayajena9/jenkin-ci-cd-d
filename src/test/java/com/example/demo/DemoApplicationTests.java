package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MockMvc mockmvc;

	@Test
	public void greetingsTest() throws Exception {
		String name="Abhaya";
		mockmvc.perform(MockMvcRequestBuilders.get("/gettings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello "+name+" Congrasulations you have completed The Dev ups!!"));
	}

}
