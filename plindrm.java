public class plindrm {
    public static boolean ispalindrm(int number){

        if(number<0){
            number *= -1; //converting negatives inputs in positive
        }

        int digit;
        int reverse = 0;
        int stored = number;
        while(stored>0){

            digit = stored % 10; // to get last digit
            stored /= 10; // remaining digit
            reverse = reverse*10 + digit; //storing each digit by digit in reverse order

        }

        if(reverse == number){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(ispalindrm(-111111));
    }
}
