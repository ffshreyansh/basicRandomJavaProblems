public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int i;
        int sum =0;
        for (i = 1; i < number; i++) {
            if(number%i == 0){
                sum += i;
            }
        }return sum == number && number>1;
    }
}
