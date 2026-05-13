import java.util.Scanner;
public class countOccurrence2DArray {
    public static void countOccurrence(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (key == array[i][j]) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();
        countOccurrence(array, key);
    }
}