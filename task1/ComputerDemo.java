package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer theFast = new Computer();
		theFast.price = 1250;
		
		Computer theCool = new Computer(2008, 1234.5, 1500, 500);
		
		Computer theExpensive = new Computer(2015, 2300.9, true, 2000, 1700, "Windows 10");
		
		printPriceComparison(theFast.comparePrice(theCool));
		
		printPriceComparison(theCool.comparePrice(theExpensive));
		
	}

	//Method that prints a comparison result:
	
	static void printPriceComparison(int comparisonResult) {
		
		if (comparisonResult == -1) {
			System.out.println("The first computer is more expensive.");
		} else {
			if (comparisonResult == 1) {
				System.out.println("The second computer is more expensive.");
			} else {
				System.out.println("The two computers have the same price.");
			}
		}
	}
	
	
	
	
}
