package OOPCONSTRUCTOR_OVERLOADING;

public class Main {
    public static void main(String[] args){

        Time time1 = new Time(); // Saat 00:00:00
        Time time2 = new Time(13); // Saat 13:00:00
        Time time3 = new Time(13, 45); // Saat 13:45:00
        Time time4 = new Time(13, 45, 30); // Saat 13:45:30
        Time time5 = new Time(time4);


        System.out.println("Universal Time:");
        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());
        System.out.println(time3.toUniversalString());
        System.out.println(time4.toUniversalString());
        System.out.println(time5.toUniversalString());

        System.out.println("Standard Time:");
        System.out.println(time1.toStringg());
        System.out.println(time2.toStringg());
        System.out.println(time3.toStringg());
        System.out.println(time4.toStringg());
        System.out.println(time5.toStringg());

    }
}
