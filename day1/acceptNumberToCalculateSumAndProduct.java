package day1;
// Q: Write a Java program to accept two numbers from the user and calculate sum and product.
import java.util.Scanner;

public class acceptNumberToCalculateSumAndProduct {
    public static void main(String []args){

        int sum,Product = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("enter the num 1 and num2 :");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        sum = num1 + num2;
        Product = num1 * num2;

        System.out.println("Sum is ="+sum);
        System.out.println("Product is = "+Product);

    }
    
}
