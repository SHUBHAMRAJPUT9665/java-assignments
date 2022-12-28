

// Write a Java program to take the length and breadth of a rectangle and print its area.
import java.util.Scanner;

public class areaReactangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of reactangle: ");
        int length = sc.nextInt();

        System.out.println("enter breath of reactangle: ");
        int breath = sc.nextInt();

        int area = length * breath;

        System.out.println("the area of reactangle is: " +area);

    }
}
