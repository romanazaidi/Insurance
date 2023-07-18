package com.project.Insurance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsuranceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testdemoPolicy() {
		Policy policy =new Policy(1,"1st Feb 2339", "31st Mar 8989","Romana");
		DemoService dService = new DemoService();
		assertEquals(policy.getPolId(),dService.demoPolicy().getPolId());
	}

	
}

