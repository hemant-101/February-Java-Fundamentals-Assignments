package Geek22Assig;

import java.util.Scanner;

public class Geek22Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        evenOdd(a);
    }
         public static void evenOdd(int a){

            if (a % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("odd number");
            }
        }
   }

