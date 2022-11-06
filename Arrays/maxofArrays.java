public class maxofArrays {
    public static void main(String[] args) {
        int[] arr = {12, 14, 13, 24, 19};
        System.out.println(max(arr));

    }
    private static int max(int[] arr){
        int maxVal= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        
        return maxVal;
    }

}
