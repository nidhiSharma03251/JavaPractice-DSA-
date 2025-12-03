package sorting;

public class bubbleSort {

    public static void bubbleAsc(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        bubbleAsc(arr, n);
        printArray(arr, n);
    }
}
