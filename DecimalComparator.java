public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        int x  = (int) (a*1000);
        int y = (int) (b*1000);

        if (x-y==0){
            return true;
        } 
        return false;

    }
}
