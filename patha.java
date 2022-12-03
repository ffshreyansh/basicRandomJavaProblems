import java.util.Scanner;

public class patha {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[5];
    int n;
    n = in.nextInt();

    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();

    }
    System.out.println(arr);
    } 
}
