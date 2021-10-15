import java.util.*;

public class MetricConversion {
    public static void main(String[] args){
        int value;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer to convert: ");
        value = keyboard.nextInt();
        
        footToCenti(value);
        inchToCenti(value);
        gallonToLiters(value);
    }
    public static void footToCenti(int value){
        // 1 ft = 30.48 cm
        double convert;
        convert = value * 30.48;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1 ft = 30.48 cm");
        System.out.println("Therefore, "+ value +" ft is equal to "+ convert +" cm.");
    }
    public static void inchToCenti(int value){
        // 1 in = 2.54 cm
        double convert;
        convert = value * 2.54;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1 in = 2.54 cm");
        System.out.println("Therefore, "+ value +" inch/es is equal to "+ convert +" cm.");
    }
    public static void gallonToLiters(int value){
        // 1 US gallon = 3.7854 L
        double convert;
        convert = value * 3.7854;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1 US gallon = 3.7854");
        System.out.println("Therefore, "+ value +" US gallon is equal to "+ convert +" L.");
    }
}
