package br.edu.univas.controller;

import br.edu.univas.vo.User;

public class LoginController {

	public boolean login(User user) {
		if (user.login() == null) {
			return false;
		}
		return true;
	}
	
}
