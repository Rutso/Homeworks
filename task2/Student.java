package task2;

public class Student {

	
	//State. Fields:
	String name;
	String subject;
	double grade;
	byte yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	
	//Constructors:
	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	
	//Methods:
	void upYear(){
		if (isDegree == false) {
			this.yearInCollege++;
			this.age++;
		} else {
			System.out.println("Student " + this.name + " has graduated already.");
		}
		
		if (this.yearInCollege == 4) {
			this.isDegree = true;
		}
	}
	
	double receiveScholarship(double min, double amount) {
		
		if (this.grade >= min && this.age < 30) {
			this.money+=amount;
		}
		return this.money;
	}
	
}
