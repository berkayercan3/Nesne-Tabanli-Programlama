package OOPTHROW;

import java.util.stream.StreamSupport;

public class Main {
    public static void main (String[] args){
        Time time = new Time();

        displayTime("After time object is created : ",time);
        System.out.println();

        time.setTime(13,34,45);
        displayTime("After calling setTime : ",time);
        System.out.println();

        try{
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception : %s%n%n",e.getMessage());
        }
        displayTime("After calling setTime with invalid values: ",time);
    }
    private static void displayTime(String header , Time t){
        System.out.printf("%s%n Universal time: %s%n Standart time:  %s%n",
                header,t.toUniversalString(),t.toString());
    }
}
