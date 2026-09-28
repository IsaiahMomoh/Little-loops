import java.util.Scanner;
public class DistanceConvert{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter distance in miles:");
    double miles = input.nextDouble();
    double kilometres = miles * 1.60934;
    System.out.println("Enter Miles:" + miles);
    System.out.println("Enter Kilometres:" + kilometres);
    }
}
