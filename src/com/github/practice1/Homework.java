package com.github.practice1;

public class Homework {

	// Create a method checkUserName that will throw a runtime exception.
	// Method should throw an exception when the entered username is less than 5
	// characters.

	public static void main(String[] args) {

		String userName = "Umut";

		try {
			checkUserName(userName);
		}
		catch (LengthException le) {
			System.out.println(le);
		}
	}

	public static void checkUserName(String userName) throws LengthException {

		if (userName.length() < 5) {
			throw new LengthException("Username: " + userName + " is too short!");
		}
	}
}

class LengthException extends Exception {

	public LengthException(String msg) {
		super(msg);
	}
}
