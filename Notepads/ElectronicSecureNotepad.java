package Notepads;

public class ElectronicSecureNotepad extends SecureNotepad implements IElectronicSecureNotepad {

	//Fields:
	private boolean isOn;
	
	//Constructor:
	public ElectronicSecureNotepad(int numberOfPages, String password) {
		super(numberOfPages, password);
		
	}
	
	
	//Methods:
	@Override
	public void start() {
		if (this.getPages() == null) {
			System.out.println("Invalid notepad!");
			System.out.println();
			return;
		}
		
		if (this.isOn == true) {
			System.out.println("The ElectronicSecureNotepad is already ON.");
			System.out.println();
		} else {
			this.isOn = true;
			System.out.println("The ElectronicSecureNotepad is turned ON.");
			System.out.println();
		}
		
	}

	@Override
	public void stop() {
		if (this.getPages() == null) {
			System.out.println("Invalid notepad!");
			System.out.println();
			return;
		}
		
		if (this.isOn == false) {
			System.out.println("The ElectronicSecureNotepad is already OFF.");
			System.out.println();
		} else {
			this.isOn = false;
			System.out.println("The ElectronicSecureNotepad is turned OFF.");
			System.out.println();
		}
		
	}

	@Override
	public boolean isStarted() {
		
		return this.isOn;
	}

}
