package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit_v4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass method will be execute before first test method started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass method will be execute after last test method completed");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method will be execute before every test method");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method will be execute after every test method");
	}

	@Test
	public void test_01_assertEquals_Positive() {
		System.out.println("test_01_assertEquals_Positive");
	}
	
	@Test
	public void test_02_assertEquals_Negative() {
		System.out.println("test_02_assertEquals_Negative");
	}
	
	@Test
	public void test_03_assertEquals_Ignored() {
		System.out.println("test_03_assertEquals_Ignored");
	}
	
	@Test
	public void test_04_assertSame_Positive() {
		System.out.println("test_04_assertSame_Positive");
	}
	
	@Test
	public void test_05_assertSame_Negative() {
		System.out.println("test_05_assertSame_Negative");
	}
	
	@Test
	public void test_06_assertSame_Ignored() {
		System.out.println("test_06_assertSame_Ignored");
	}
	
	@Test
	public void test_07_assertFalse_Positive() {
		System.out.println("test_07_assertFalse_Positive");
	}
	
	@Test
	public void test_08_assertFalse_Negative() {
		System.out.println("test_08_assertFalse_Negative");
	}
	
	@Test
	public void test_09_assertTrue_Positive() {
		System.out.println("test_09_assertTrue_Positive");
	}
	
	@Test
	public void test_10_assertTrue_Negative() {
		System.out.println("test_10_assertTrue_Negative");
	}
}
