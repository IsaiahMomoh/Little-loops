import java.util.Scanner;
public class ScaleMark{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter score out of 50: ");
    double originalScore = input.nextDouble();
    double scaledScore = originalScore * 2;
    System.out.println("Originals score: " + originalScore);
    System.out.println("Scaled score: " + scaledScore);
    }
}
