package Notepads;

import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad implements ISecureNotepad {

	//Fields:
	private String password;

	//Constructor:
	public SecureNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		if (isStrongPassword(password)) {
			this.password = password;
			System.out.println(password + " is a strong password.");
		} else {
			System.out.println(password + " is a weak password. This notepad can't be created!");
			//throw new IllegalArgumentException(
                   // "Password should have 1 upper case letter, 1 lower case letter, 1 number and to be at least 5 characters long.");
			this.setPagesToNull();
			this.setNumberOfPagesToNull();
			System.out.println();
			return;
		}
		
		
	}

	//Overriden methods (implemented form the Inotepad interface in the super class SimpleNotepad) that ask for password:
	@Override
	public void addTextToPage(String additionalText, int pageNumber) {
			if (this.checkPassword()) {
					super.addTextToPage(additionalText, pageNumber);
			}
		
		
	}
	
	@Override
	public void deleteTextOnPage(int pageNumber) {
		if (this.checkPassword()) {
			super.deleteTextOnPage(pageNumber);
		}
		
	}
	
	
	@Override
	public void replaceTextOnPage(String newText, int pageNumber) {
		if (this.checkPassword()) {
			super.replaceTextOnPage(newText, pageNumber);
		}
		
	}
	
	@Override
	public void setPageHeadline(String headline, int pageNumber) {
		if (this.checkPassword()) {
			super.setPageHeadline(headline, pageNumber);
		}
				
	}
	
	@Override
	public void viewAllPages() {
		if (this.checkPassword()) {
			super.viewAllPages();
		}
		
	}

	
	
	
	
	@Override
	public boolean checkPassword() {
		System.out.println("Please, enter password: ");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		
		if (!(password.equalsIgnoreCase(this.password))) { 			//It's a simple password that is not case sensitive!
			System.out.println("Invalid password! Access denied!");
			return false;
		}
		
		return true;
	}
	
	protected boolean isStrongPassword(String password) {
		
		boolean length = false;
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean number = false;
		
		if (password.length() < 5) {
			System.out.println("ERROR! Password must have at least 5 characters.");
			return false;
		} else {
			length = true;
		}
		
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
				upperCase = true;
			}
			
			if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
				lowerCase = true;
			}
			
			if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
				number = true;
			}
		
		
		}
		
		if (length && upperCase && lowerCase && number) {
			return true;
		}
		
		if (!upperCase) {
			System.out.println("ERROR! Password must have at least 1 upper case letter.");
		}
		if (!lowerCase) {
			System.out.println("ERROR! Password must have at least 1 lower case letter.");
		}
		if (!number) {
			System.out.println("ERROR! Password must have at least 1 number.");
		}
	
		return false;
		
	}
	
	
	
	
}
