package com.vti.backend.businesslayer;



import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserService {
	// Q1: in ra het xem khoi tao duoc chua
	List<User> getListUsers() throws SQLException, ClassNotFoundException;
	//Q2: nhap vao IDProject, in ra employee va manager
	User getUserByProjectId(int id) throws SQLException, ClassNotFoundException;
	//Q3 Login
	User login(String email, String password) throws Exception;
	boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;
}
