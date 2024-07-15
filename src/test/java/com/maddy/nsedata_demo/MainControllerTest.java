package com.maddy.nsedata_demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void findBySymbol_ShouldReturnMessage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/securities/symbol/TCS").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1765,\"symbol\":\"TCS\",\"paidUpValue\":\"1\",\"isinNumber\":\"INE467B01029\",\"nameOfCompany\":\"Tata Consultancy Services Limited\",\"marketLot\":\"1\",\"series\":\"EQ\",\"dateOfListing\":\"25-AUG-2004\",\"faceValue\":\"1\"}"));
	}
}