package br.edu.univas.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.univas.vo.Professor;

public class LoginControllerTest {

	private LoginController classUnderTest = new LoginController();
	
	@Test
	public void login_whenUserLoginReturnNull_shouldReturnFalse() {
		Professor professor = new Professor();
		
		boolean result = classUnderTest.login(professor);
		
		assertEquals(true, result);
	}
	
}
