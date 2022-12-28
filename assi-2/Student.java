//- Input name, roll number and field of interest from user and print in the format below :
//  Name: xyz, Roll number: xyz, Field of interest: xyz

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
       System.out.println("enter first name: ");
       String first_name = sc.next();

       System.out.println("enter last name: ");
       String last_name = sc.next();

       System.out.println("enter roll number: ");
       int roll_number = sc.nextInt();

       System.out.println("enter field of interest: ");
       String field_of_interest = sc.next();

       System.out.println("Name: " + first_name + " " + last_name);
       System.out.println("Roll Number: " + roll_number);
       System.out.println("Field of interest: " + field_of_interest);
    }
}
