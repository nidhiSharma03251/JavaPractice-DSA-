package ArraysTwoDimensional;

public class diagonalSum {
    public static int diagonalMatrixSum(int matrix[][]){
        int sum=0; 
        for(int i=0; i<matrix.length; i++){
            sum +=matrix[i][i];
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] ={
                        {5,4,1,3,2},
                        {1,2,3,4,5},
                        {6,7,8,9,1},
                        {1,2,3,4,5},
                        {1,2,3,4,5}
                    };
        System.out.println(diagonalMatrixSum(matrix));
    }
}
