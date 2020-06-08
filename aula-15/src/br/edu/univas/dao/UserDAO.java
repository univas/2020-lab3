package br.edu.univas.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.User;

public class UserDAO {

	private static List<User> users = new ArrayList<User>();
		
	public void addUser(User user) {
		users.add(user);
	}
	
	public User getUserByName(String name) {
		User findUser = new User(name);
		int indexUser = users.indexOf(findUser);
		if (indexUser > -1) {
			return users.get(indexUser);
		}
		return null;
	}
}
