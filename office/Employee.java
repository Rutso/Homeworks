package office;


public class Employee {

	//Fields:
	private final String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;
	
	
	//Constructor:
	public Employee(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("NullNameError");
			this.name = null;
			return;
		}
	}
	
	
	//Setters:
	public void setHoursLeft (int hours) {
		if (this.hoursLeft == 0 && hours > 0 && hours <= 8) {
			this.hoursLeft = hours;
		}
	}
	
	public void setCurrentTask(Task newTask) {
		if (newTask != null) {
			this.currentTask = newTask;
		} else {
			System.out.println("Null task assigned to Employee.");
		}
	}
	public void setAllWork(AllWork allwork) {
		if (allwork != null) {
			Employee.allWork = allwork;
		} else {
			System.out.println("Null array with tasks assigned to Employee.");
		}
	}
	
	
	//Getters:
	public String getName() { 
		return this.name;
	}
	
	public Task getCurrentTask() {
		return this.currentTask;
	}
	
	public int getHoursLeft() {
		return this.hoursLeft;
	}
	
	public AllWork getAllWork() {
		return Employee.allWork;
	}
	
	//Methods:
	public void startWorkingDay() {
		this.hoursLeft = 8;
	}
	
		
	public void work() {
		while(this.hoursLeft > 0) {
			if (this.currentTask == null || this.currentTask.getWorkingHours() == 0) {
				if (allWork.isAllWorkDone()) {
					System.out.println(this.name + " is happy because all tasks have been done.");
					return;
				} else {
					Task temp = allWork.getNextTask();
					if (temp == null) {
						System.out.println(this.name + " plays video games.");
						return;
					} else {
						this.setCurrentTask(temp);
						System.out.println(this.name + " starts work on a new task: " + this.currentTask.getName());
					}
				}
			} else {
				System.out.println(this.name + " continues work on the current task: " + this.currentTask.getName());
			}
				
			if (this.currentTask.getWorkingHours() > this.hoursLeft){
					int temp = this.hoursLeft;
					this.hoursLeft = 0;
					this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - temp);
					System.out.println(this.name + " finished the working day without finishing the current task: " + this.currentTask.getName());
					return;
				} else {
					this.hoursLeft-= this.currentTask.getWorkingHours();
					this.currentTask.setWorkingHours(0);
					System.out.println(this.name + " finished the task " + this.getCurrentTask().getName());
			
				}
			}
		
	}
	
			
}
