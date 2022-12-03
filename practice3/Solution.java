import java.util.Arrays;

class Solution {
    // public int[] runningSum(int[] nums) {

    //     int[] ans = new int[nums.length];
    //     ans[0] = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //             ans[i] = ans[i-1] + nums[i];
    //     }return ans;
        
    // }

    
    //     public int[] buildArray(int[] nums) {
    //        int[] ans = new int[nums.length];
    //        for (int i = 0; i < nums.length; i++) {
    //             ans[i] = nums[nums[i]];
    //        }return ans;
    // }
    

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        ans = nums;
        // int lastIndex = nums.length - 1;
        for (int i = nums.length; i < ans.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    ans[i] = nums[j];
                }
        }return ans;
    
    }
}