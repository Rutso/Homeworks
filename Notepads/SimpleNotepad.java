package Notepads;

public class SimpleNotepad implements INotepad {

	//Fields:
	private Page[] pages;
	private int numberOfPages;
	
	
	//Constructor:
	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
			this.pages = new Page[numberOfPages];
		} else {
			System.out.println("Can't create a notepad with less than 1 page.");
			return;
		}
		
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}

	//Getter:
	public Page[] getPages() {
		return this.pages;
	}
	
	
	//Methods - implementation of the INotepad interface methods (using the methods from the Page class):
	@Override
	public void addTextToPage(String additionalText, int pageNumber) {
		if (checkPageNumber(pageNumber)) {
			pages[pageNumber-1].addText(additionalText);
		}
				
	}


	@Override
	public void replaceTextOnPage(String newText, int pageNumber) {
		if (checkPageNumber(pageNumber)) {
			pages[pageNumber-1].deleteText();
			pages[pageNumber-1].addText(newText);
		}
		
	}


	@Override
	public void deleteTextOnPage(int pageNumber) {
		if (checkPageNumber(pageNumber)) {
			pages[pageNumber-1].deleteText();	
		}
		
	}


	@Override
	public void viewAllPages() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].getHeadline() == null && pages[i].getText() == null) {
				System.out.println("Page " + (i+1) + " is blank.");
			} else {
				System.out.println("Page " + (i+1) + ":");
				System.out.println(pages[i].viewPage());
				System.out.println();
			}
		}
	}
	
	@Override
	public void setPageHeadline(String headline, int pageNumber) {
		if (checkPageNumber(pageNumber)) {
			pages[pageNumber-1].setHeadline(headline);	
		}
		
	}
	
	
	
	
	private boolean checkPageNumber(int pageNumber) {
		if (pageNumber > this.numberOfPages || pageNumber <= 0) {
			System.out.println("No such page in this notepad!");
			return false;
		} else {
			return true;
		}
	}

	protected void setPagesToNull() {
		this.pages = null;
	}
	protected void setNumberOfPagesToNull() {
		this.numberOfPages = 0;
	}
	
	
	
	
	
}
