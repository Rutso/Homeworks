package task2;

public class College {

	public static void main(String[] args) {

		Student tarzan = new Student("Tarzan Gorski", "Ecology", 19);
		tarzan.receiveScholarship(3, 3000);
		tarzan.grade = 3;
		
		Student pikachu = new Student("Pikachu Pokemonov", "Nuclear Physics", 12);
		pikachu.receiveScholarship(4, 5000);
		pikachu.upYear();
		pikachu.upYear();
		pikachu.grade = 4.5;
		
		Student spiderman = new Student("Peter Parker", "Nuclear Physics", 21);
		spiderman.upYear();
		spiderman.grade = 5;
		
		Student pamela = new Student("Pamela Anderson", "Ecology", 18);
		pamela.receiveScholarship(2, 3000);
		pamela.receiveScholarship(2, 3000);
		pamela.grade = 2;
		
		Student jenna = new Student ("Jenna Jameson", "Nuclear Physics", 20);
		jenna.upYear();
		jenna.grade = 5.5;
		
		Student karateKid = new Student("Daniel LaRusso", "Ecology", 18);
		karateKid.grade = 4.7;
		
		Student kong = new Student("King Kong", "Ecology", 150);
		
		Student wolverine = new Student("Logan", "Ecology", 200);
		wolverine.grade = 2.90;
		
		Student jackie = new Student("Jackie Chan", "Ecology", 65);
		jackie.grade = 6;
		
		StudentGroup theGoodOnes = new StudentGroup("Ecology");
		StudentGroup theSmartOnes = new StudentGroup("Nuclear Physics");
		
		theGoodOnes.addStudent(tarzan);
		theGoodOnes.addStudent(pikachu);
		theGoodOnes.addStudent(pamela);
		theGoodOnes.addStudent(karateKid);
		theGoodOnes.addStudent(kong);
		theGoodOnes.addStudent(wolverine);
		theGoodOnes.addStudent(jackie);
		
		theSmartOnes.addStudent(pikachu);
		theSmartOnes.addStudent(spiderman);
		theSmartOnes.addStudent(jenna);
		
		System.out.println("The best student in " + "'" + theGoodOnes.groupSubject + "'" + " group is " + theGoodOnes.theBestStudent() + ".");
		System.out.println("The best student in " + "'" + theSmartOnes.groupSubject + "'" + " group is " + theSmartOnes.theBestStudent() + ".");
		
		
		theGoodOnes.printStudentsInGroup();
		theSmartOnes.printStudentsInGroup();
	}

}
