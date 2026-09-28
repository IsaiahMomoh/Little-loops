import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter price:");
    double price = input.nextDouble();
    double tax = price * 0.075;
    double total = price + tax;
    System.out.println("Total:" + total);
    }
}
