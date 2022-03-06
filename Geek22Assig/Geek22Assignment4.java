package Geek22Assig;

import java.util.Scanner;

public class Geek22Assignment4 {
    public static void main(String[] args) {
//        write a program to calculate sum all numbers till n using while loop


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){

             sum = sum + i;
            i++;
        }
        System.out.println(sum);





    }
}
