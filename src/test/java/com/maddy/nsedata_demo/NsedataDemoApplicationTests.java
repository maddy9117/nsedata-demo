package com.maddy.nsedata_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NsedataDemoApplicationTests {

	@Autowired
private MainController controller;


	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
