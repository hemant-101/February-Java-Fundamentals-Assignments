package Geek22Assig;

import java.util.Scanner;

public class Geek22Assignment2 {
    public static void main(String[] args) {
//        write program calculate factorial
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            int i =1;
        int factorial = 1;
        do {
            factorial = factorial * i;
            i++;
          continue;
        }while(i<=a);
        System.out.println(factorial);
        }



    }


