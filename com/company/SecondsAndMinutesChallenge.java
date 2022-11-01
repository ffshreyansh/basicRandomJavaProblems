package com.company;

public class SecondsAndMinutesChallenge {
    
    private  static String getDurationString(long minutes, long seconds){
        if((minutes <0) || (seconds < 0 || seconds >59)){
            return "Invalid Value";
        }
        long HH = minutes / 60;
        long MIN = minutes % 60;
        return HH + "h" + MIN + "m" + seconds + "s";     

    }  

    private  static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
            long minutes = seconds/60;
            // long remainingSeconds = seconds % 60;
            String x = getDurationString(minutes, seconds);
            return x;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        
}
}