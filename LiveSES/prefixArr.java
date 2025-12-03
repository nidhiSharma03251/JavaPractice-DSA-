package LiveSES;

public class prefixArr {
    public static void main(String[] args) {
        int arr[] = {10,1,5,7,3,8};
        int n = arr.length;

        int prev = arr[0];
        for(int i=1; i<n; i++){
            arr[i] = prev + arr[i];
            prev = arr[i]; 
        }

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
