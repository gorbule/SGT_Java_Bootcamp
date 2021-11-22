package com.alexa.gorbule.JUnit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

class ContactManagerTests {

	ContactManager contactManager;

	/**
	 * Will print some text before test output
	 */
	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before ALL TESTS");
	}

	/**
	 * Will create a new contactManager before each test
	 * Don't forget to create a new element before
	 */
	@BeforeEach
	public void setup() {
		contactManager = new ContactManager();
	}

//	@Test
//	public void shouldCreateContact() {
//		contactManager.addContact("John", "Doe", "0123456789");
//		Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
//		Assertions.assertEquals(1, contactManager.getAllContacts().size());
//	}

	@DisplayName("Repeated Test --> 4 times")
	@RepeatedTest(value = 4)
	public void shouldCreateContact() {
		contactManager.addContact("John", "Doe", "0123456789");
		Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
		Assertions.assertEquals(1, contactManager.getAllContacts().size());
	}

	@DisplayName("Source Value or MethodSource")
	@ParameterizedTest
	//@ValueSource(strings = {"0212121212", "0123698740", "0030507088"}) ---> @MethodSource
	@MethodSource("phoneNumberList")
	public void shouldTestContactCreationUsingValueSource(String phoneNumber) {
		contactManager.addContact("John", "Doe", phoneNumber);
		Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
		Assertions.assertEquals(1, contactManager.getAllContacts().size());
	}

	private static List<String> phoneNumberList() {
		return Arrays.asList("0212121212", "0123698740", "0030507088");
	}

	@DisplayName("CSV Source case")
	@ParameterizedTest
	@CsvSource({"0212121212", "0123698740", "0030507088"})
	public void shouldTestContactCreationUsingCsvSource(String phoneNumber) {
		contactManager.addContact("John", "Doe", phoneNumber);
		Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
		Assertions.assertEquals(1, contactManager.getAllContacts().size());
	}

	@Nested
	class RepeatedNestedTest {
		@DisplayName("Repeated Test --> 5 times")
		@RepeatedTest(value = 5)
		public void shouldCreateContact() {
			contactManager.addContact("John", "Doe", "0123456789");
			Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
			Assertions.assertEquals(1, contactManager.getAllContacts().size());
		}
	}

	@Nested
	class ParameterizedNestedTest {
	//Here you can enter any test. I just copied one of tests
	}

}
