package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.dao.UserDAO;
import br.edu.univas.view.LoginView;
import br.edu.univas.vo.User;

public class LoginController {

	private LoginView loginView;
	private Scanner scanner;
	private UserDAO userDAO;
	
	public LoginController() {
		this.loginView = new LoginView();
		this.scanner = new Scanner(System.in);
		this.userDAO = new UserDAO();
	}

	public User login() {
		loginView.showLogin();
		loginView.showUserName();
		String name = scanner.nextLine();
		User user = userDAO.getUserByName(name);
		
		if (user == null) {
			loginView.showFailLogin();	
		} else {
			loginView.showSuccessLogin();
		}
		return user;
	}
	
}
