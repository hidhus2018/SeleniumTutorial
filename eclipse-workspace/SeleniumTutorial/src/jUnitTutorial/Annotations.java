package jUnitTutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Annotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This is beforeAll method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is afterAll method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is beforeEach method");
	}
	

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is afterEach method");
	}

	@Test
	void test() {
		System.out.println("This is Test method");
	}


}
