import java.util.Arrays;
import java.util.Scanner;

public class arrPractice1 {
    public static void main(String[] args) {
        
        // int[] arr = new int[15];

        // System.out.println(arr[9]);

        // arr[4] = 35;

        // arr[8] = arr[5] + arr[12];
        

        // String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // System.out.println(Arrays.toString(arr));

        // for(String arry: arr ){
        //     System.out.println(arry);

        //   }
        Scanner in = new Scanner(System.in);
        int[] arr = new int[11];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();
            sum += arr[i];
            
        }
        System.out.println(sum);

    }
}
