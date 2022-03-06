package geek21Assig;

public class Geek21Assignment1 {
    public static void main(String[] args) {
//        wap to find the first 3 terms of 4n+9 where it is divisible by 3
            int count = 0;
        for (int i= 1; i<=20; i++){
            int n = 4*i +9;
            if(n%3==0){
                System.out.println(i);
                count++;
                if(count==3){
                    break;
                }
            }
        }



    }
}
