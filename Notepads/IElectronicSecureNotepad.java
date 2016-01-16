package Notepads;

public interface IElectronicSecureNotepad extends ISecureNotepad {

	public void start();
	public void stop();
	public boolean isStarted();
	
	@Override
	default void useSecureNotepad() {
		if (this.getPages() == null) {
			System.out.println("Invalid notepad!");
			System.out.println();
			return;
		}
		
		if (this.isStarted()) {
			ISecureNotepad.super.useSecureNotepad();
			this.stop();
		} else {
			System.out.println("The ElectronicSecureNotepad is OFF. You need to turn it ON to work with it.");
		}

		
	}
	
	@Override
	default void welcome() {
		System.out.println("Welcome to ElectronicSecureNotepad.");
	}
	
}
