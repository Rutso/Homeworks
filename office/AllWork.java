package office;

public class AllWork {

	//fields:
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	//constructor:
	public AllWork() {
		this.tasks = new Task[10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}
	
	//methods:
	public void addTask(Task newTask) {
		if (this.freePlacesForTasks > 0) {
			if (newTask != null) {
				this.tasks[this.tasks.length-this.freePlacesForTasks] = newTask;
				this.freePlacesForTasks--;
				System.out.println(newTask.getName() + " was added to the list of tasks.");
			} else {
				System.out.println("Null task added to AllWork.");
			}
		} else {
			System.out.println("Can't add more tasks.");
		}
	}
	
	public Task getNextTask() {
		if (this.currentUnassignedTask == this.tasks.length) {
			return null;
		} else {
			if (this.tasks[this.currentUnassignedTask] == null) {
				return null;
				} else {
					this.currentUnassignedTask++;
					return this.tasks[this.currentUnassignedTask-1];
			}
		}
	}
	
	public boolean isAllWorkDone() {
		int counter = 0;
		int i = 0;
		while (i < this.tasks.length && this.tasks[i] != null) {
		
			if (tasks[i].getWorkingHours() != 0) {
				return false;
			}
			i++;
			counter++;
		} 
		if (counter == i) {
			return true;
		}
		return false;
	}
	
		
}
