package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		return userService.getListUsers();
	}

	public User getUserByProjectId(int id) throws SQLException, ClassNotFoundException {
		return userService.getUserByProjectId(id);
	}

	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userService.isUserIdExits(id);
	}
	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}

}
