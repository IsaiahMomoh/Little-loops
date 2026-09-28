public class IntegersSwap{
    public static void main(String [] args){
    int firstNumber = 10;
    int secondNumber = 20;
    System.out.println("Before swap:");
    System.out.println("First:" + firstNumber);
    System.out.println("Second:" + secondNumber);
    int temporaryNumber = firstNumber;
    firstNumber = secondNumber;
    secondNumber = temporaryNumber;
    System.out.println("After swap:");
    System.out.println("First:" + firstNumber);
    System.out.println("Second:" + secondNumber);
    }
}
    
