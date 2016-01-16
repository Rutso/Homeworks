package Notepads;

public interface INotepad {

	//Abstract methods:
	public void addTextToPage(String additionalText, int pageNumber);
	
	public void replaceTextOnPage(String newText, int pageNumber);
	
	public void deleteTextOnPage(int pageNumber);
	
	public void viewAllPages();
	
	public void setPageHeadline(String headline, int pageNumber);
	
	public Page[] getPages();
	
	//Default methods:
	default public void searchWord(String word) {
		int counter = 0;
		for (int i = 0; i < this.getPages().length; i++) {
			if (this.getPages()[i].searchWord(word)) {
				System.out.println("Page " + (i+1) + " contains the word " + word + ".");
				System.out.println();
				counter++;
				}
		}
		if (counter == 0) {
			System.out.println("The notepad doesn't contain the word " + word + ".");
			System.out.println();
		}
	}
	
	default void printAllPagesWithDigits() {
		int counter = 0;
		for (int i = 0; i < this.getPages().length; i++) {
			if (this.getPages()[i].containsDigits()) {
				System.out.println("Page " + (i+1) + " contains digit: ");
				System.out.println(this.getPages()[i].viewPage());
				System.out.println();
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("The notepad doesn't contain pages with digits.");
			System.out.println();
		}
	}
	
	
	
}
