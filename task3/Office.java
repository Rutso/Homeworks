package task3;

public class Office {

	public static void main(String[] args) {
		
		System.out.println("Kuma Lisa needed some help.");
		
		Employee kumchoValcho = new Employee("Kumcho Valcho");
		kumchoValcho.setHoursLeft(8);
		
		Employee babaMetsa = new Employee("Baba Metsa");
		babaMetsa.setHoursLeft(8);
		
		Employee zayoBayo = new Employee("Zayo Bayo");
		zayoBayo.setHoursLeft(8);
		System.out.println("So she hired " + kumchoValcho.getName() + ", " + babaMetsa.getName() + " and " + zayoBayo.getName() + " to do the job.");
		
		
		Task one = new Task("Gather food", 20);
		Task two = new Task("Clean house", 15);
		Task three = new Task("Repair the boots", 30);
		System.out.println("She gave them three jobs: '" + one.getName() + "', '" + two.getName() + "' and '" + three.getName() + "'.");		
		
		
		kumchoValcho.setTask(one);
		babaMetsa.setTask(two);
		zayoBayo.setTask(three);
		
		System.out.println("And so they started working.");
		kumchoValcho.work();
		babaMetsa.work();
		zayoBayo.work();
		
		System.out.println("After the first working day...");
		kumchoValcho.showReport();
		babaMetsa.showReport();
		zayoBayo.showReport();
		
		System.out.println();
		System.out.println("Kuma Lisa was very content and asked them to come again tomorrow.");
		kumchoValcho.setHoursLeft(8);
		babaMetsa.setHoursLeft(8);
		zayoBayo.setHoursLeft(8);
		
		System.out.println("Ejko Bejko also came to help.");
		Employee ejkoBejko = new Employee("Ejko Bejko");
		ejkoBejko.setHoursLeft(8);
		
		kumchoValcho.setTask(three);
		babaMetsa.setTask(one);
		zayoBayo.setTask(two);
		
		
		kumchoValcho.work();
		babaMetsa.work();
		zayoBayo.work();
		
		System.out.println("After the second working day...");
		kumchoValcho.showReport();
		babaMetsa.showReport();
		zayoBayo.showReport();
		ejkoBejko.showReport();
		
		System.out.println("Kuma Lisa said: EJKO, BRAAT!!!");
	}

}
