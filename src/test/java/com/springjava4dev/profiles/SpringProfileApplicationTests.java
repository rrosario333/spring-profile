package com.springjava4dev.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringProfileApplication.class)
@ActiveProfiles("dev")
public class SpringProfileApplicationTests {

	@Test
	public void contextLoads() {
	}

}
