
import java.util.Scanner;
public class CashiersChecker{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter item price:");
    double price = input.nextDouble();
    System.out.print("Enter quantity:");
    int quantity = input.nextInt();
    double subtotal = price * quantity;
    double vat = subtotal * 0.20;
    double grandTotal = subtotal + vat;
    System.out.println("Subtotal:" + subtotal);
    System.out.println("Vat:" + vat);
    System.out.println("GrandTotal:" + grandTsotal);
    }
}
