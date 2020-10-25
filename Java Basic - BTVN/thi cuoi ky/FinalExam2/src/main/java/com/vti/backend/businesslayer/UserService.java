package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService {

	private IUserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	@Override
	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		return userRepository.getListUsers();
	}

	@Override
	public User getUserByProjectId(int id) throws SQLException, ClassNotFoundException {
		return userRepository.getUserByProjectId(id);
	}

	@Override
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userRepository.isUserIdExits(id);
	}
	@Override
	public User login(String email, String password) throws Exception {
		return userRepository.login(email, password);
	}

}
