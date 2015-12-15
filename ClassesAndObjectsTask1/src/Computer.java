
public class Computer {
	
	//State of the class Computer:
	short year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	
	//Behaviour of the class Computer:
	//Method 1:
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}
	
	//Method 2:
	void useMemory(int memory) {
		
		if (memory > 0) {
			if (memory <= freeMemory) {
				freeMemory-=memory;
				} else {
					System.out.println("Not enough free memory");
				}
			} 
	}
	
		
}
