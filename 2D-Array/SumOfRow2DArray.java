//Print out the sum of the numbers inthe second row of the “nums” array
import java.util.Scanner;
 public class SumOfRow2DArray {

    public static void sumOfRow(int array[][], int rowNum) {
        int sum = 0;

        if (rowNum > array.length) {
            System.out.println("Enter the row in range of " + array.length);
        } else {
            for (int i = rowNum-1; i < rowNum; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sum += array[i][j];
                }
            }
            System.out.println("The sum of the row " + rowNum + " is " + sum);
        }

    }

    public static void main(String[] args) {
        int array[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number to sum: ");
        int rowNum = sc.nextInt();
        sc.close();

        sumOfRow(array, rowNum);
    }
} 