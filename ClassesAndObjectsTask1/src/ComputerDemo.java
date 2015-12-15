
public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer moiatComputer = new Computer();
		Computer tvoiatComputer = new Computer();
		
		moiatComputer.year = 2014;
		moiatComputer.price = 2000;
		moiatComputer.isNotebook = true;
		moiatComputer.hardDiskMemory = 1000;
		moiatComputer.freeMemory = 500;
		moiatComputer.operationSystem = "Windows 8.1";
		
		
		tvoiatComputer.year = 2015;
		tvoiatComputer.price = 2500;
		tvoiatComputer.isNotebook = false;
		tvoiatComputer.hardDiskMemory = 1500;
		tvoiatComputer.freeMemory = 1000;
		tvoiatComputer.operationSystem = "DOS";
		
		moiatComputer.useMemory(100);
		
		tvoiatComputer.changeOperationSystem("Windows 10");
		
		System.out.println("moiatComputer: ");
		displayComputerFields(moiatComputer);
		System.out.println("tvoiatComputer: ");
		displayComputerFields(tvoiatComputer);
		
		
	}
	
	//Method that displays all fields of an object from the Computer class:
	static void displayComputerFields(Computer nechiiComputer) {
		
		
		System.out.println("Produced in " + nechiiComputer.year);
		System.out.println("It's price is " + nechiiComputer.price + " leva.");
		if (nechiiComputer.isNotebook == true) {
			System.out.println("It's a notebook.");
		} else {
			System.out.println("It's a desktop computer.");
		}
		System.out.println("The hard disk capacity is " + nechiiComputer.hardDiskMemory + " MB.");
		System.out.println("Currently there are " + nechiiComputer.freeMemory + " MB free space on the hard drive.");
		System.out.println("The OS is " + nechiiComputer.operationSystem);
		
		System.out.println();
	}
	
	
}
