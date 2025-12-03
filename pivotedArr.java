public class pivotedArr {
    public static int findTarget(int arr[], int n, int target){
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]>target){
                if(arr[start]<target && target <arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid]<target && target < arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,8,10,2,3,4}; //Rotated sorted array
        int n = arr.length;
        int target = 3;
        System.out.println("Element found at index :" + findTarget(arr,n,target));
    }
}
