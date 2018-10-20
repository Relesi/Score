package com.relesi.score;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest(classes = ScoreApplication.class)
@TestPropertySource(locations="classpath:test.properties")
public class ScoreApplicationTests {

	@Test
	public void contextLoads() {
	}
	

}
