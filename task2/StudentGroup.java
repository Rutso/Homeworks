package task2;

public class StudentGroup {

	
	//State. Fields:
	String groupSubject;
	Student[] students;
	byte freePlaces;
	
	
	//Constructors:
	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}
	
	
	//Methods:
	void addStudent(Student s) {
		
		if (s.subject.equalsIgnoreCase(this.groupSubject) && this.freePlaces > 0) {
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null) {
					this.students[i] = s;
					this.freePlaces--;
					return;
				}
			}
		} else {
			if (!(s.subject.equalsIgnoreCase(this.groupSubject))) {
				System.out.println(s.name + "'s subject is different from this group's subject.");
			}
			if (this.freePlaces == 0) {
				System.out.println("Sorry, " + s.name + ". There are no vacant places in '" + this.groupSubject + "' group.");
			}
		}
	}
	
	void emptyGroup() {
		for (int i = 0; i < this.students.length; i++) {
			this.students[i] = null;
		}
		this.freePlaces = 5;
	}
	
	String theBestStudent(){
		String theBestOne;
		double theBestGrade = 0;
		int theBestOneIndex = 0;
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null && this.students[i].grade > theBestGrade) {
				theBestGrade = this.students[i].grade;
				theBestOneIndex = i;
			} else {
				if (this.students[i] == null ) {
					break;
				}
			}
		}
		theBestOne = this.students[theBestOneIndex].name;
		return theBestOne;
	}
	
	void printStudentsInGroup() {
		
		System.out.println("Group " + this.groupSubject + ":");
		System.out.println("Free places: " + freePlaces);
		for(int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				System.out.println("Student " + (i+1) + ":");
				System.out.println("Name: " + this.students[i].name);
				System.out.println("Age: " + this.students[i].age);
				System.out.println("Year in college: " + this.students[i].yearInCollege);
				System.out.println("Grade: " + this.students[i].grade);
				System.out.println("Money from scholarship: " + this.students[i].money);
				if (this.students[i].isDegree) {
					System.out.println("Status: graduated");
				} else {
					System.out.println("Status: not graduated");
				}
			} else {
				return;
			}
		}
		
	}
	
}
