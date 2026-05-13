//Write a program to Find Transpose of a Matrix.
public class TransposeMatrix{
    public static void main(String[] args){
        int[][] matrix={
            {11,12,13},
            {21,22,23}
        };

        int row=matrix.length;
        int col=matrix[0].length;

        int[][] transpose=new int[col][row];

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}