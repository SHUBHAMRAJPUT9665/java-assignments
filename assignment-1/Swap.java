import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        System.out.println("number before swaping a:"+ a + " b:"+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("number after swaping swaping a:"+ a + "b:"+b);

    }
    
}
