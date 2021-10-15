import java.util.*;

public class Insurance {
    public static void main(String[] args){
        
        double currentYear;                       // I use double so I can convert the age to its decade hihi
        double birthYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        currentYear = keyboard.nextDouble();
        System.out.print("Enter your birth year: ");
        birthYear = keyboard.nextDouble();
        premiumAcc(currentYear, birthYear);
    }
    public static void premiumAcc(double currentYear, double birthYear){
        double age;
        int decade, premium;

        age = (currentYear - birthYear)* 0.1;
        decade = (int) age;                      //base on my research, this is called explicit type casting
        premium = (decade + 15) * 20;
        System.out.println("Your premium amount is $"+premium+".");
    }
}
