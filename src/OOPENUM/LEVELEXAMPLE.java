package OOPENUM;

enum Level{
    LOW,
    MEDIUM,
    HARDD,
}

public class LEVELEXAMPLE{
    public static void main(String[] args){
        Level level = Level.HARDD; //ENUM çağırım şekli new ile çağrılmazz!!

        switch (level){
            case HARDD:
                System.out.println("Zor Seviye");
                break;
            case MEDIUM:
                System.out.println("ORTA Seviye");
                break;
            case LOW:
                System.out.println("Kolay Seviye");
                break;
        }
    }
}
