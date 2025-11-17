import java.util.*;
public class palindrome {

    public static void checkPalindrome(int num){
        int temp = num;
        int rev = 0;
        while(num >0){
            int ld = num %10;
            rev = rev*10 + ld;
            num = num /10;
        }
        System.out.println(rev);
        if(rev == temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
    public static void main(String[] args) {
        int num= 50905;
        checkPalindrome(num);
    }
}
