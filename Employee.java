import java.util.*;

public class Employee{
    static String name;
    static int age;
    static int rate;
    static int days;
    static int rateDay;
    static int monthSalary;
    static int annualWage;
    static int absences;
    static int govFee;
    static double decade;
    static double tenPercent;
    static double finalTotal;
    static Scanner input = new Scanner(System.in);

    public static void totalSalary(int rate, int days){
        rateDay = rate * 8; //hours
        days = days - absences;
        monthSalary = ((rateDay * days)*4) - govFee;
        annualWage = monthSalary*12;

        return;
    }

    public static void deductions(int age, int days, int monthSalary, int annualWage){

        System.out.print("Number of absences: ");
        absences = input.nextInt();
        System.out.print("Government deduction fees: ");
        govFee = input.nextInt();

        decade = age * 0.1;
        decade = (int) decade;      //this will be the decade then add number of days
        tenPercent = (decade + days ) * (monthSalary * 0.1);        //multiplied to ten percent of the monthly salary
        finalTotal = tenPercent + monthSalary;

    }
    public static void main(String[] args){
        

        System.out.print("Fullname: ");
        name = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Rate per hour: ");
        rate = input.nextInt();
        System.out.print("Days work per week: ");
        days = input.nextInt();

        totalSalary(rate, days);
        deductions(age, days, monthSalary, annualWage);

        System.out.println("===================================================");
        System.out.println("Fullname: " + name);
        System.out.println("Age: "+ age);
        System.out.println("====================================================");
        System.out.println("Rate per hour: " + rate);
        System.out.println("Number of Absences: " + absences);
        System.out.println("Government Deduction fees: " + govFee);
        System.out.println("====================================================");
        System.out.println("Monthly Salary: " + monthSalary );
        System.out.println("Annual Wage: " + annualWage);
        System.out.println("Your total salary is " + finalTotal);
        
    }
}