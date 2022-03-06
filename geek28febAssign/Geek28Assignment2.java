package geek28febAssign;

public class Geek28Assignment2 {
    public static void main(String[] args) {
        System.out.println(multi(4,6));
        System.out.println(multi(456871,4576));
        System.out.println(multi(4.545f,7.6486f));
    }
    static int multi(int a, int b){
        int multi = a * b ;
        return multi;
    }
    static long multi(long a , long b){
        long multi = a * b ;
        return multi;
    }
    static float multi(float a, float b){
        float multi = a * b ;
        return multi;
    }
}
