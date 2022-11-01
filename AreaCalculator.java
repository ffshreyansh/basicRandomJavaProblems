public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        double AreaofCircle = Math.PI*radius*radius;
        return AreaofCircle;
    }
    public static double area   (double x, double y){

        if( x<0 || y<0){
            return -1;
        }
        double AreaofRectangle = x*y;
        return AreaofRectangle;
    }
}
