import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in celcius:");
    double celcius = input.nextDouble();
    double fahrenheit = (celcius * 9/5 ) + 32;
    System.out.println("Enter temperature in fahrenheit: " + fahrenheit);
    }
}
