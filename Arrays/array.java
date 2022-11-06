import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        
    // int[] ros;
    // ros = new int[5];
    // // System.out.println(ros[1]);

    // String[] arr= new String[4];
    // System.out.println(arr[0]);

    Scanner in = new Scanner(System.in);

    //xxxxxxx----------------------------------------Array of Primitives------------------------------xxxxxxx

    // int[] arr = new int[5];
    // arr[0] = 12;
    // arr[1] = 102;
    // arr[2] = 121;
    // arr[3] = 132;
    // arr[4] = 212;
    
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = in.nextInt();
    //     }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }

        // System.out.println(Arrays.toString(arr));  --------------------Best Way to print all in the array

        //xxxxxxx----------------------------------------Array of Objects------------------------------xxxxxxx

            String[] str = new String[4];
            for (int i = 0; i < str.length; i++) {

                str[i] = in.next();
            }
                System.out.println(Arrays.toString(str));

                //modify
                str[1] = "shreyansh";

                System.out.println(Arrays.toString(str));

                str[2] = "kumar";

                System.out.println(Arrays.toString(str));
            
    }

}