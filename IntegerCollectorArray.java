import java.util.Scanner;
public class IntegerCollectorArray{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number");
    int firstNumber = input.nextInt();
    System.out.print("Enter second number");
    int secondNumber = input.nextInt();
    System.out.print("Enter third number");
    int thirdNumber = input.nextInt();
    System.out.print("Enter fourth number");
    int fourthNumber = input.nextInt();
    System.out.print("Enter fifth number");
    int fifthNumber = input.nextInt();
    int [] array = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
    System.out.printf("%s%8s%n", "Index", "Value");

    for(int counter = 0; counter < array.length; counter ++){
    System.out.printf("%5d%8d%n", counter, array [counter]);
        }

    int largest = numbers[0];
    int smallest = numbers[0];
    int sum = 0;
    for(int count = 0; count < 5; count ++){
    if(array[count] > largest){
    largest = numbers;
    }
    if(array[count] < smallest){
    smallest = numbers[count];
    }
    sum += numbers[count];
    }
    double average = sum/array.length;
    System.out.println("Largest:" + largest);
    System.out.println("Smallest:" + smallest);
    System.out.println("Average:" + average);

     }
}

