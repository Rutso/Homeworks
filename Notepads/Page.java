package Notepads;

public class Page {
	
	//Fields:
	private String headline;
	private String text;
	
	
	//Constructors:
	public Page() {									//Create a blank page.
		
	}
	
	public Page(String headline, String text) { 	//Initialise the page with headline and text.
		this.headline = headline;
		this.text = text;
	}
	
	
	//Setter:
	public void setHeadline(String headline) {		//Set the headline.
		this.headline = headline;
	}
	
	//Getters:
	public String getHeadline() {
		return this.headline;
	}
	
	public String getText() {
		return this.text;
	}
	
	
	//Methods:
	public void addText(String additionalText) {	//Add text.
		if (this.text == null) {
			this.text = additionalText;
		} else {
			this.text = this.text + additionalText;
		}
	
	}
	
	public void deleteText() {						//Delete the text.
		this.text = new String();
	}
	
	public String viewPage() {						//Display the headline and the text on the next line.
		return "Headline: "+this.headline+"\n"+"Text: "+this.text;
	}
	
	
	public boolean searchWord(String word) {
		if ((this.text != null && this.text.contains(word)) || (this.headline != null && this.headline.contains(word))) {
			return true;
		}
		return false;
	}
	
	public boolean containsDigits() {
		if (this.headline != null) {
			for (int i = 0; i < this.headline.length(); i++) {
				if (this.headline.charAt(i) > 47 && this.headline.charAt(i) < 58) {
					return true;
				}
			}
		}
		
		if (this.text != null) {
			for (int i = 0; i < this.text.length(); i++) {
				if (this.text.charAt(i) > 47 && this.text.charAt(i) < 58) {
					return true;
				}
			}
		}
		
		
		return false;
	}
}
