import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    // public int[] buildArray(int[] nums) {
        
    //     // Scanner in = new Scanner(System.in);

        
    // public static void main(String[] args) {
    //     System.out.println();
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ans = new int[6];
        int[] nums = new int[6];
        for (int i = 0; i < nums.length - 1; i++) {

            nums[i] = in.nextInt();
            
            ans[i] =  nums[nums[i]];
                

        }
        
        System.out.println( Arrays.toString(ans));
    }
    }
