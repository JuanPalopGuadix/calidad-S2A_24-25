package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2A.calculadora;

class calculadoraTest {
	int v1,v2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("afterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		this.v1=5;
		this.v2=3;
				
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("afterEach");
	}

	@Test
	void testSuma() {
		int expected=8;
		int actual=calculadora.suma(v1, v2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected=2;
		int actual=calculadora.resta(v1, v2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected=15;
		int actual=calculadora.multiplica(v1, v2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected=1;
		int actual=calculadora.divide(v1, v2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivideEntre0() {
		int expected=-1;
		v2=0;
		int actual=calculadora.divide(v1, v2);
		assertEquals(expected, actual);
	}

}
