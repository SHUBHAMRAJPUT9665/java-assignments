import java.util.Scanner;

// - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
//   to calculate his total marks and percentage marks.

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("enter marks in three subjects: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int total_marks = mark1 + mark2 + mark3;
        int percentage = (total_marks / 3);
        System.out.println("total is: " +total_marks);
        System.out.println("percentages: " +percentage + "%");
    }
    
}
