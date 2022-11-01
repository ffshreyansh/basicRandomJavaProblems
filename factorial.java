public class factorial {
    public static int isFactorial(int n) {
        // int digit;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        int count = 0;

        while (factorial % 10 == 0) {
            count++;
            factorial /= 10;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(isFactorial(16));
    }
}
