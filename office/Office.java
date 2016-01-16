package office;

public class Office {

	public static void main(String[] args) {
		
		//1. Create one ALLWork type object:
		AllWork allwork = new AllWork();
		
		//2. Fill the allwork array with 10 tasks with different work time:
		Task task1 = new Task("Create the algorithm", 17);
		allwork.addTask(task1);
		Task task2 = new Task("Define classes", 37);
		allwork.addTask(task2);
		Task task3 = new Task("Write methods", 50);
		allwork.addTask(task3);
		Task task4 = new Task("Create artwork", 20);
		allwork.addTask(task4);
		Task task5 = new Task("Build web application", 27);
		allwork.addTask(task5);
		Task task6 = new Task("Debug", 15);
		allwork.addTask(task6);
		Task task7 = new Task("More debug", 10);
		allwork.addTask(task7);
		Task task8 = new Task("Testing", 30);
		allwork.addTask(task8);
		Task task9 = new Task("Refactoring", 23);
		allwork.addTask(task9);
		Task task10 = new Task("Prepare the presentation", 30);
		allwork.addTask(task10);
		Task task11 = new Task("Make changes", 3);
		allwork.addTask(task11);
		System.out.println();
		
		//3. Employ 3-4 new employees and give them the list with the tasks and "Opraviaite se!":
		Employee prokopii = new Employee("Prokopii Umnoto");
		prokopii.setAllWork(allwork);
		Employee stamat = new Employee("Stamat Izvunzemnia");
		stamat.setAllWork(allwork);
		Employee penka = new Employee("Penka Mozaka");
		penka.setAllWork(allwork);
		
		//4. Start working on tasks:
		int day = 1;
		while(!(allwork.isAllWorkDone())) {
			
			System.out.println("Start of day " + day);
			
			prokopii.startWorkingDay();
			stamat.startWorkingDay();
			penka.startWorkingDay();
			
			prokopii.work();
			stamat.work();
			penka.work();
				
			System.out.println("End of day " + (day));
			System.out.println();
			day++;
		}
						
	}

}
