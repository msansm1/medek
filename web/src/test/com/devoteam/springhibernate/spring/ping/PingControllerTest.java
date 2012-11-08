package com.devoteam.springhibernate.spring.ping;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.devoteam.springhibernate.spring.json.JsonResponse;

/**
 * Unit testing class for PingController.
 * 2 context configurations available for testing in Eclipse or in Jenkins.
 * 
 * @author rbarbot
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring-servlet.xml")
public class PingControllerTest {
	
	private PingController pingController = new PingController();

	@Test
	public void pingTest() {
		MockHttpSession session = new MockHttpSession();
		MockHttpServletRequest request = new MockHttpServletRequest();
		JsonResponse response = pingController.ping(session, request);
		assertNotNull("Ping response is null.", response);
	}
}
