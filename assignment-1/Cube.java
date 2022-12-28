

// Write a Java program to calculate the cube of a number.
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int x = sc.nextInt();

        int cube=x*x*x;
        System.out.println("The side is : "+x);
        System.out.println("The cube is : "+cube);
    }
    
}
