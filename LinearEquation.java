import java.util.Scanner;

public class LinearEquation {
	public static void main (String[] args) {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            float a = input.nextFloat();
            System.out.println("Enter the value of b");
            float b = input.nextFloat();
            System.out.println("Enter the value of c");
            float c = input.nextFloat();
            System.out.println("Enter the value of d");
            float d = input.nextFloat();
            System.out.println("Enter the value of e");
            float e = input.nextFloat();
            System.out.println("Enter the value of f");
            float f = input.nextFloat();
            
            if ((a * d) - (b * c) == 0) {
            	System.out.println("The equation has no solution.");
            } else {
            	float x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
                float y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
                System.out.println("x is " + x + " and y is " + y);
            }
        }
        
        System.out.println("Exiting problem...");
    }
}