import java.util.*;

public class Exercise {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;

        System.out.println("The sum of " + x + " and " + y + " is " + a);
        System.out.println("The difference of " + x + " and " + y + " is " + b);
        System.out.println("The product of " + x + " and " + y + " is " + c);
        System.out.println("The quotient of " + x + " and " + y + " is " + d);
        
        in.close();
    }
}