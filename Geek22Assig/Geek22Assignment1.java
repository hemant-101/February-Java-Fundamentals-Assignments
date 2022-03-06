package Geek22Assig;
import java.util.Scanner;

public class Geek22Assignment1 {
    public static void main(String[] args) {
//            wap to calculate no. of digits in a number by user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int a = sc.nextInt();
        int count =0;
        for (int i= 0; i<=a;i++){
             a = a/10;
             count++;
        }
        System.out.println("given number is " +count + " digit");

    }

}
