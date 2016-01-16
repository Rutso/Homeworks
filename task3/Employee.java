package task3;


public class Employee {

	//Fields:
	private String name;
	private Task currentTask;
	private double hoursLeft;
	
	
	//Constructor:
	Employee(String name) { //visible from the current package
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("NoNameError");
			return;
		}
	}
	
	
	//Setters:
	void setName(String name) { //visible from the current package
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("NoNameError");
			return;
		}
	}
	
	void setTask (Task theTask) {
		if (theTask != null) {
			this.currentTask = theTask;
		} else {
			System.out.println("NoTaskError");
		}
	}
	
	
	void setHoursLeft (double hours) {
		if (this.hoursLeft == 0 && hours > 0 && hours <= 8) {
			this.hoursLeft = hours;
		}
	}
	
	//Getters:
	String getName() { //visible from the current package
		return this.name;
	}
	
	Task getCurrentTask() {
		return this.currentTask;
	}
	
	double getHoursLeft() {
		return this.hoursLeft;
	}
	
	
	//Methods:
	void work() {
		if (this.currentTask == null) {
			
			return;
		}
		
		if (this.currentTask.getWorkingHours() >= this.hoursLeft ){
			double temp = this.hoursLeft;
			this.hoursLeft = 0;
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - temp);
			
		} else {
			this.hoursLeft-= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
			
		}
	}
	
	void showReport() {
		System.out.println();
		System.out.println("Report on employee " + this.name + ":");
		if (this.currentTask == null) {
			System.out.println("No current task assigned.");
		} else {
				System.out.println("Current task: " + this.currentTask.getName());
		}
		System.out.println("Hours left today: " + this.hoursLeft);
		if (this.currentTask == null) {
			System.out.println("No current task assigned.");
		} else {
			 System.out.println("Hours left on current task: " + this.currentTask.getWorkingHours());

		}
	}
	
}
