
import java.util.Scanner;
public class PersonalBiodata{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first name:");
    String firstName = input.nextLine();
    System.out.print("Enter last name:");
    String lastName = input.nextLine();
    System.out.print("Enter year of birth:");
    int yearOfBirth = input.nextInt();
    int currentYear = 2025;
    int age = currentYear - yearOfBirth;
    System.out.println();
    System.out.println("Enter last name: " + lastName);
    System.out.println("Enter year of birth: " + yearOfBirth);
    System.out.println("Enter age:" + age);
    }
}
