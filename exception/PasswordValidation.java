package com.assignments.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

/*8) User will input the password and with the help of your algorithm. You are suppose to test that 
password is strong or not. A password is said to be strong if it is of length in the range of 8 to 14 
and having at least 2 capital letters, 2 small letters, 2 digits and 2 special characters. This is minimum 
requirements for password of length 8 for password of length greater than 8 this should be present 
and other character can be used. If user not entered the password in given format 
PasswordFormatException should be thrown and handled properly.
*/

class Password {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		^                 # start-of-string
//		(?=.*[0-9])       # a digit must occur at least once
//		(?=.*[a-z])       # a lower case letter must occur at least once
//		(?=.*[A-Z])       # an upper case letter must occur at least once
//		(?=.*[@#$%^&+=])  # a special character must occur at least once
//		(?=\S+$)          # no whitespace allowed in the entire string
//		.{8,}             # anything, at least eight places though
//		$                 # end-of-string
		String regex = "^(?=(.*[0-9]){2})(?=(.*[a-z]){2})(?=(.*[A-Z]){2})(?=(.*[@#$%^&+=]){2})(?=\\S+$).{8,14}$";
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(password).matches())
			this.password = password;
		else {
			String errorMsg = "";
			if (password.length() < 8 || password.length() > 14) {
				errorMsg = " should range between 8 to 14";
			} else {
				errorMsg = " should having at least 2 capital letters, 2 small letters, 2 digits and 2 special characters \"";
			}
			throw new PasswordFormatException("Invalid Password : " + password + errorMsg);
		}
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}

}

class PasswordFormatException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public PasswordFormatException(String errorMessage) {
		super(errorMessage);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		try {
			String str = scan.nextLine();
			System.out.println(str);

			Password pass = new Password();
			try {
				pass.setPassword(str);
				System.out.println(pass.getPassword() + " is a valid password");
			} catch (PasswordFormatException pfe) {
				System.out.println(pfe.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
