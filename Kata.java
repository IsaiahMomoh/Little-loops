public class Kata{

	public static void main(String[] args){

		java.util.Scanner inputCollector = new java.util.Scanner(System.in);

		System.out.println("Enter a number: ");
		//int number = inputCollector.nextInt();
		//System.out.println("The number you inputted is " + number);

		System.out.println("Enter a name: ");
		String name = inputCollector.nextLine();
		System.out.println("Java-The name you inputted is " + name);

		Scanner thisScanner = new Scanner();
		name = thisScanner.nextLine();
		System.out.println("Our-The name you inputted is " + name);

		//int newNumber = thisScanner.nextInt();
		//System.out.println("The number you inputted is " + newNumber);		
		

		

		


	}
}