import java.util.*;

public class BookstoreCredit {

    public static void main(String[] args){
        String studName;
        double grade;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        studName = keyboard.nextLine();
        System.out.print("Enter your grade point average: ");
        grade = keyboard.nextDouble();
        
        displayMessage(studName, grade);
    }
    public static void displayMessage(String studName, double grade){
        int award = 10;
        double credit;

        credit = grade * award;
        System.out.println("************************************");
        System.out.println("Name: "+ studName);
        System.out.println("Grade Point Average: "+grade);
        System.out.printf("Bookstore Credit: $%.2f",credit);
    }
}
