package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;

public class Excercise1 {
public static void main(String[] args) {
	Account account1 = new Account(1, "concho@gmail.com", "concho", "con", "cho", "java", LocalDate.now()
			);
	ex3q1(account1);
}
public static void ex3q1(Account account)
{	
System.out.println(account.getEmail());
}
}
