package com.company;

public class feetnInches{      
        
        public static double calcFeetAndInchesToCentimeters(double feet, double inches){
            if((feet < 0) || ((inches < 0 ) || (inches >12 ))){
                return -1;
            }
            double  centimeters = (feet*12)*2.54;
            centimeters += inches *2.54;
            System.out.println(feet + " feets " + inches + " inches " + centimeters + " = centimeters. " );
            return centimeters;
        }
        
        public static void main(String[] args) {
            calcFeetAndInchesToCentimeters(6, 0);
            calcFeetAndInchesToCentimeters(100);
        }
            
        public static double calcFeetAndInchesToCentimeters( double inches){

            if (inches < 0){
                return -1;
            }

            double feet = (int) inches/12;
            double remaininInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remaininInches);
            return calcFeetAndInchesToCentimeters(feet, inches);

        }
                
    }   


      

