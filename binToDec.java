import java.util.*;

public class binToDec {
    public static void bintodec(int n){
        int pow = 0;
        int dec = 0;
        while(n > 0){
            int ld = n%10;
            dec = dec + (ld * (int)Math.pow(2,pow));
            n = n/10;
            pow++;
        }
        System.out.println("the decimal form of the number is "+ dec);
    }
    public static void main(String args[]){
        bintodec(10001001);
}
}