package task1;

public class Computer {
	
	//State of the class Computer:
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	
	//Constructors:
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		
		if (year > 2001) {
			this.year = year;
		} else {
			System.out.println("Invalid value for the year.");
			return;
		}
		
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Invalid value for the price.");
			return;
		}
		
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			System.out.println("Invalid value for the hard disk memory.");
			return;
		}
		
		if (freeMemory <= (hardDiskMemory - 2)) { //2 GB for Win XP :)
			this.freeMemory = freeMemory;
		} else {
			System.out.println("Invalid value for the free memory.");
			return;
		}
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
				
		if (year > 2001) {
			this.year = year;
		} else {
			System.out.println("Invalid value for the year.");
			return;
		}
		
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Invalid value for the price.");
			return;
		}
		
		this.isNotebook = isNotebook;
		
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			System.out.println("Invalid value for the hard disk memory.");
			return;
		}
		
		if (freeMemory <= (hardDiskMemory - 2)) { //2 GB for Win XP :)
			this.freeMemory = freeMemory;
		} else {
			System.out.println("Invalid value for the free memory.");
			return;
		}
		
		
		this.operationSystem = operationSystem;
		
	}
	
	
	
	//Behaviour of the class Computer:
	//Method 1:
	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}
	
	//Method 2:
	void useMemory(int memory) {
		
		if (memory > 0) {
			if (memory <= freeMemory) {
				this.freeMemory-=memory;
				} else {
					System.out.println("Not enough free memory.");
				}
			} 
	}
	
	//Method 3:
	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else {
			if (this.price < c.price) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	
	
		
}
