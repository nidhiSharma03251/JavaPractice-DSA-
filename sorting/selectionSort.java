package sorting;

public class selectionSort {
    public static void selection(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        selection(arr, n);
        printArray(arr, n);
    }
}


