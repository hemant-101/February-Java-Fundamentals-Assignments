package geek16febAssign;

import java.util.Scanner;

public class Assignment3 {

  static void EvenOrOdd(int a){
       if(a % 2== 0){
           System.out.println("even");
       }
       else{
           System.out.println("odd");
       }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        EvenOrOdd(a);
    }


}
