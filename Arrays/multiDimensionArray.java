import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray {

    public static void main(String[] args) {

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        // int[][] arr = new int[3][];

        // int[][] arr2D = {
        // {1, 2, 3},
        // {4, 5},
        // {6, 7, 8, 9}
        // };

        // System.out.println(Arrays.toString(arr2D));
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows


        // input

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = in.nextInt();

            }
        }
        
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
            
        }
        // // output

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr.length; col++) {
        //         System.out.print(arr[row][col] + "");
        //     }
        // }
    }
}