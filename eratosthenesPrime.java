import java.util.*;
public class eratosthenesPrime{

    public static void checkPrime(int n){
        boolean [] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;
        for(int i=2; i<=n; i++){
            prime[i] = true;
        }

        for(int p=2; p*p<=n; p++){
            if(prime[p]){
                for(int multiple = p*p; multiple<=n; multiple+=p){
                    prime[multiple]= false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter a number:");
            int n = sc.nextInt();
            checkPrime(n);
    }
}