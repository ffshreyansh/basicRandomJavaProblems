public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        
        if(number<0){
            return -1;
        }
        int sum = 0;    
        while (number > 0) { //loop ends when all the numbers have been tested
            if (((number%10)%2) == 0) { //test for the last digit is even
                sum += number%10; //takes out the last digit
            }
            number /= 10; //takes out last digit to test the next digit
        }
        return sum;
        
        
    }
    // public static void main(String[] args) {
    //     System.out.println(getEvenDigitSum(2122051));
    // }
}
