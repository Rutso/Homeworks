package Notepads;

public class NotepadDemo {

	public static void main(String[] args) {
		
		//1. Use of Page class:
		System.out.println("USE OF PAGE CLASS:");
		Page one = new Page();
		System.out.println(one.viewPage());
		System.out.println();
		
		one.setHeadline("The Headline");
		System.out.println(one.viewPage());
		System.out.println();

		one.addText("Tralalalalalalalalla lalalallalala lalalalala!");
		System.out.println(one.viewPage());
		System.out.println();

		one.deleteText();
		System.out.println(one.viewPage());
		System.out.println();
		
		
		//2. Use of the SimpleNotepad class:
		System.out.println("USE OF SIMPLENOTEPAD CLASS:");

		SimpleNotepad note = new SimpleNotepad(10);
		
		note.setPageHeadline("Pesen za vafli", 1);
		note.addTextToPage("Kuku ruku vafla chudna", 1);
		note.setPageHeadline("Pesen za zemedelieto", 2);
		note.addTextToPage("Dve praskovi posiah i dve cheresi", 2);
		note.setPageHeadline("Pesen za lova", 10);
		note.addTextToPage("Foxy laddy!!! I'm commin to getcha!!!", 10);
		note.addTextToPage("Ima li takava stranica?", 11);
		System.out.println();
		
		note.viewAllPages();
		
		
		//3.A. Use of SecureNotepad class:
		//System.out.println("USE OF SECURENOTEPAD CLASS:");
		SecureNotepad snote = new SecureNotepad(10,"Password2");
		//snote.setPageHeadline("Random song", 1);
		//snote.addTextToPage("Blahblahblahblahblah", 1);
		//snote.viewAllPages();
		//snote.addTextToPage("LALALALALALALALALALAAAA", 1);
		//snote.viewAllPages();
		//snote.deleteTextOnPage(1);
		//snote.viewAllPages();
		
		
		//3.B Use of SecureNotepad class with a super-duper method :):
		System.out.println("USE OF SECURENOTEPAD CLASS WITH A SUPER-DUPER METHOD:");
		snote.useSecureNotepad();
		
		//3.C: Declaration of type ISecureNotepad:
		ISecureNotepad snote2= new SecureNotepad(10, "pass");
		// snote2.useSecureNotepad() ;
		
		
		
		//4. Use of the ElectronicSecureNotepad
		IElectronicSecureNotepad esnote = new ElectronicSecureNotepad(10, "Password2");
		esnote.useSecureNotepad();
		esnote.start();
		esnote.useSecureNotepad();
		
		
		
		
		
		
	}

	
	//First the super-duper method was created here but later I decided to put it as a default 
	//method in ISecureNotepad interface (it's Java 8 isn't it ;)).
	/*
	 * public static void useSecureNotepad(SecureNotepad snote) {
		System.out.println("Welcome to SecureNotepad.");
		boolean use = true;
		while(use == true) {
			Scanner sc = new Scanner(System.in);
			int operation = 0;
			do {
				System.out.println("To view all pages press 1.");
				System.out.println("To set a page headline press 2.");
				System.out.println("To add text to a page press 3.");
				System.out.println("To delete text on a page press 4.");
				System.out.println("To exit SecureNote press 5.");
				System.out.println("NOTE: Each operation requires a password!");
				operation = sc.nextInt();
			} while (operation < 0 || operation > 5);
			
			int pageNumber = 0;
			String text = new String();
			
			switch (operation) {
			case 1:
				snote.viewAllPages();
				break;
			
			case 2:
				while (text.length() == 0) {
					System.out.println("Please, enter a headline: ");
					text = sc.nextLine();
				}
								
				do {
					System.out.println("Please, enter a page number from 1 to " + snote.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > snote.getPages().length);
				snote.setPageHeadline(text, pageNumber);
				break;
			
			case 3:
				while (text.length() == 0) {
					System.out.println("Please, enter a text to add: ");
					text = sc.nextLine();
				}
							
				do {
					System.out.println("Please, enter a page number from 1 to " + snote.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > snote.getPages().length);
				snote.addTextToPage(text, pageNumber);
				break;
				
			case 4:
				do {
					System.out.println("Please, enter a page number from 1 to " + snote.getPages().length);
					pageNumber = sc.nextInt();
				} while (pageNumber < 1 || pageNumber > snote.getPages().length);
				snote.deleteTextOnPage(pageNumber);
				break;
				
			case 5:
				use = false;
				break;
			}



		}
		
	}
	 */
	
	
	
}
