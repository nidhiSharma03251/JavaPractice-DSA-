package ArraysTwoDimensional;

public class spiralMatrix {

    public static void findSpiralMatrix(int matrix[][]){
        int s_row = 0;
        int e_row =matrix.length-1;
        int s_col = 0;
        int e_col = matrix[0].length-1;

        while(s_row<=e_row && s_col<=e_col){
            for(int i=s_col; i<=e_col; i++){
                System.out.print(matrix[s_row][i] + " ");
            }
            for(int i=s_row+1; i<=e_row; i++){
                System.out.print(matrix[i][e_col]+ " ");
            }
            for(int i=e_col-1; i>=s_col; i--){
                // if(s_row==e_row){
                //     break;
                // }
                System.out.print(matrix[e_row][i]+ " ");
            }
            for(int i=e_row-1; i>=s_row+1; i--){
                // if(s_col==e_col){
                //     break;
                // }
                System.out.print(matrix[i][s_col]+ " ");
            }
            s_row++;
            e_row--;
            s_col++;
            e_col--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] ={{5,4,1,3,2},
                        {1,2,3,4,5},
                        {6,7,8,9,1}};
        findSpiralMatrix(matrix);
    }
}
