package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.view.MenuView;
import br.edu.univas.vo.User;

public class MainController {

	private Scanner scanner;
	private MenuView menuView;
	private LoginController loginController;
	private UserController userController;
	private User userLogged;

	public MainController() {
		this.scanner = new Scanner(System.in);
		this.menuView = new MenuView();
		this.loginController = new LoginController();
		this.userController = new UserController();
	}

	public void initialize() {
		do {
			menuView.showMainMenu();
			int mainOption = readIntOption();

			if (mainOption == 1) {
				userController.register();

			} else if (mainOption == 2) {
				userLogged = loginController.login();

			} else if (mainOption == 3) {
				if (userLogged == null) {
					menuView.showUserNotLogged();

				} else {
					userController.addNewCreditCard(userLogged);
				}

			} else if (mainOption == 4) {
				if (userLogged == null) {
					menuView.showUserNotLogged();

				} else {
					userController.addNewPurchase(userLogged);
				}

			} else if (mainOption == 5) {
				if (userLogged == null) {
					menuView.showUserNotLogged();

				} else {
					userLogged = loginController.login();
				}

			} else if (mainOption == 9) {
				menuView.showFarewell();
				break;

			} else {
				menuView.showInvalidOption();
			}

		} while (true);

		scanner.close();
	}

	private int readIntOption() {
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
}
