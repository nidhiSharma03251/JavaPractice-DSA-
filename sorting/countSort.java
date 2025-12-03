package sorting;

public class countSort {
    public static void count(int arr[], int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int countArr[] = new int[maxi+1];

        for(int i=0; i<n; i++){
            countArr[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<countArr.length; i++){
            while(countArr[i] > 0){
                arr[j] = i;
                countArr[i]--;
                j++;
            }
        }
    }

    public static void printArray(int arr[], int n){
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        int n = arr.length;
        printArray(arr, n);
        count(arr, n);
        printArray(arr, n);
    }
}
