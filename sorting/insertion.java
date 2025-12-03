package sorting;

public class insertion {
    public static void insertionSort(int arr[], int n){
        for(int i=1; i<n; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
        insertionSort(arr, n);
        printArray(arr, n);
    }
}
