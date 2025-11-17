import java.util.*;
public class maxSubArr {

    public static void maxSubArrBrute(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                ts++;
                if(sum > maxi){
                    maxi = sum;
                }
                System.out.println("SUM = " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum of subarray = " + maxi);
        System.out.println("Total subarrays: " + ts);
    }

    public static void prefixSub(int arr1[]){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[arr1.length];
        
        prefix[0] = arr1[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr1[i];
            System.out.print(prefix[i] + " ");
        }

        for(int i=0; i<arr1.length; i++){
            for(int j=i; j<arr1.length; j++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(sum > maxi){
            maxi = sum;
            }
        }
        System.out.println("maximum sum of sub array = " + maxi);
        System.out.println();
    }

    public static void kadanes(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            System.out.println(sum + " ");
            maxi = Math.max(sum, maxi);

            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("The sum of maximum subarray is " + maxi);
    }

    public static void main(String[] args) {
        int arr[] = {23,-8,7,-1,1,2,6,-1};
        // maxSubArrBrute(arr);
        int arr1[] = {1,-2,6,-1,3};
        // prefixSub(arr1);
        int arr2[] ={-6, -5, -9, -8, -9};
        kadanes(arr2);
    }
}
