package br.edu.univas.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.edu.univas.dao.UserDAO;
import br.edu.univas.view.UserView;
import br.edu.univas.vo.CreditCard;
import br.edu.univas.vo.Purchase;
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
	
	public void addNewCreditCard(User user) {
		userView.showAddNewCreditCard();
		userView.showRegisterCreditCardBrand();
		String brand = scanner.nextLine();
		
		userView.showRegisterCreditCardLimit();
		double limit = readDouble();
		
		CreditCard creditCard = new CreditCard();
		creditCard.setBrand(brand);
		creditCard.setLimit(limit);
		user.getCreditCards().add(creditCard);
		
		userView.showRegisterCrediCardSuccesful();
	}
	
	public void addNewPurchase(User user) {
		userView.showAddNewPurchase();
		userView.showCreditCardsFromUser(user.getCreditCards());
		userView.showSelectCreditCard();
		int option = readInt();
		
		CreditCard creditCard = user.getCreditCards().get(option - 1);
		
		userView.showRegisterPurchaseValue();
		double value = readDouble();
		
		userView.showRegisterPurchaseDate();
		Date date = readDate();
		
		userView.showRegisterPurchaseQuotes();
		int quotes = readInt();

		Purchase purchase = new Purchase(value, date, quotes);
		creditCard.getPurchases().add(purchase);
		
		userView.showRegisterPurchaseSuccesful();
	}
	
	private double readDouble() {
		double value = scanner.nextDouble();
		scanner.nextLine();
		return value;
	}
	
	private int readInt() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
	
	private Date readDate() {
		String date = scanner.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
}
