package sorting;

public class allSort {
    public static void bubbleSort(int arr[], int n){//Pushing largest to the end.
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[], int n){ //Pushing smallest in the front.
        for(int i=0; i<n-1; i++){
            int mini = i;
            for(int j=i+1; j<n; j++){
                if(arr[mini]>arr[j]){
                    mini =j;
                }
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[], int n){ //Moving the current element to its correct position in the sorted list 
        for(int i=1; i<n; i++){
            int current = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
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
        selectionSort(arr, n);
        printArray(arr, n);
    }
}
