package ArraysTwoDimensional;


public class staircase_search {

    public static int Staircase_binary(int matrix[][], int target){
        int row=0; int col=matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col] == target){
                System.out.println("Target found at index (" +row+","+col + ")");
                return 1;
            }
            else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("Target not found");
        return -1;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                            {23,24,25,26},
                            {32,33,34,35},
                            {56,57,58,59},
                            {111,123,134,155}
                        };
        int target = 59;
        Staircase_binary(matrix,target);
    }
}
