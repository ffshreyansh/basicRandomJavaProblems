class GreatestCommonDivisor {
    static int getGreatestCommonDivisor(int first, int second) {
        int i;

        if (first < 10 || second < 10) {
            return -1;
        } else if (first < second) {
            i=first;
        } else {
             i=second;
        }
        for (i = i; i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
