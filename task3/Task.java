package task3;

public class Task {
	
	//Fields:
	private String name; 
	private double workingHours; //the hours can change according to the work done
	
	//Constructor:
	Task(String name, double workingHours) { //Accessible from the current package 
		
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("NoNameError");
			return;
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		}
	}
	
	//Setter:
	void setName(String name) { //Accessible from the current package
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("NoNameError");
			return;
			
		}
	}
	
	void setWorkingHours(double workingHours) { //Accessible from the current package
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
	
	
		
	//Getters:
	String getName() { //Accessible from the current package
		return this.name;
	}
	
	double getWorkingHours() { //Accessible from the current package
		return this.workingHours;
	}
	
}
