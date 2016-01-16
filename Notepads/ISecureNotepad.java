package Notepads;

import java.util.Scanner;

public interface ISecureNotepad extends INotepad {

	//Another way to make the password check in the SecureNotepad class - here we define another method that uses the INotepad method:
	//default void addTextToPage(String additionalText, int pageNumber, String password) {
	//	addTextToPage(additionalText, pageNumber);
	//	
	//}
	
	public boolean checkPassword();
	
	
	default public void useSecureNotepad() {
		
		if (this.getPages() == null) {
			System.out.println("Invalid notepad!");
			System.out.println();
			return;
		}
		
		welcome();
		boolean use = true;
		while(use == true) {
			Scanner sc = new Scanner(System.in);
			int operation = 0;
			do {
				System.out.println("To view all pages press 1.");
				System.out.println("To set a page headline press 2.");
				System.out.println("To add text to a page press 3.");
				System.out.println("To delete text on a page press 4.");
				System.out.println("To search for a word press 5.");
				System.out.println("To display all pages with digits press 6.");
				System.out.println("To exit press 7.");
				System.out.println("NOTE: Each operation requires a password!");
				operation = Integer.parseInt(sc.nextLine());
			} while (operation < 0 || operation > 7);
			
			int pageNumber = 0;
			String text = new String();
			
			switch (operation) {
			case 1:
				this.viewAllPages();
				break;
			
			case 2:
				while (text.length() == 0) {
					System.out.println("Please, enter a headline: ");
					text = sc.nextLine();
				}
								
				do {
					System.out.println("Please, enter a page number from 1 to " + this.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > this.getPages().length);
				this.setPageHeadline(text, pageNumber);
				break;
			
			case 3:
				while (text.length() == 0) {
					System.out.println("Please, enter a text to add: ");
					text = sc.nextLine();
				}
							
				do {
					System.out.println("Please, enter a page number from 1 to " + this.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > this.getPages().length);
				this.addTextToPage(text, pageNumber);
				break;
				
			case 4:
				do {
					System.out.println("Please, enter a page number from 1 to " + this.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > this.getPages().length);
				this.deleteTextOnPage(pageNumber);
				break;
			
			case 5:
				while (text.length() == 0) {
					System.out.println("Please, enter word to search for: ");
					text = sc.nextLine();
				}
				if (checkPassword()) {
					this.searchWord(text);
					break;	
				}
				
				
			case 6:
				if (checkPassword()) {
					this.printAllPagesWithDigits();
					break;	
				}					
				
							
			case 7:
				use = false;
				break;
			}

		}
		
	}
	
	default void welcome() {
		System.out.println("Welcome to SecureNotepad.");
	}
}
