import java.util.Scanner;
public class MethodClass{


	public static void main(String[] args){
		MethodClass objectOfMethodClass = new MethodClass();
		

		
		System.out.println(objectOfMethodClass.add(65.87 , 12.5675));

		
	}
	public  int add(int firstNumber, int secondNumber){
		return firstNumber + secondNumber;
		 
	}

	public  double add(int firstNumber, double secondNumber){
		return firstNumber + secondNumber;
		 
	}
	public  double add(double firstNumber, int secondNumber){
		return firstNumber + secondNumber;
		 
	}
	public  double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
		 
	}

}