package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.dao.UserDAO;
import br.edu.univas.view.UserView;
import br.edu.univas.vo.User;

public class UserController {

	private Scanner scanner;
	private UserView userView;
	private UserDAO userDAO;
	
	public UserController() {
		this.scanner = new Scanner(System.in);
		this.userView = new UserView();
		this.userDAO = new UserDAO();
	}
	
	public void register() {
		userView.showRegisterUser();
		userView.showRegisterUserName();
		String name = scanner.nextLine();
		
		userView.showRegisterUserCellphone();
		String cellPhone = scanner.nextLine();
		
		User user = new User(name, cellPhone);
		userDAO.addUser(user);
		
		userView.showRegisterSuccessful();
	}
	
}
