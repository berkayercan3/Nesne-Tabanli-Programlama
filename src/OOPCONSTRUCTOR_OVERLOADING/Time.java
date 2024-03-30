package OOPCONSTRUCTOR_OVERLOADING;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(){ //constructor 1
        this(0,0,0);
    }
    public Time(int hour){ //constructor 2
        this(hour,0,0);
    }
    public Time(int hour,int minute){ //constructor 3
        this(hour,minute,0);
    }

    public Time(int hour,int minute,int second){ //constructor 4
        if(hour>=24 || hour < 0)
            throw new IllegalArgumentException("Hatalı bir saat girişi!");
        if (minute>=60 || minute<0)
            throw new IllegalArgumentException("Hatalı dakika girişi!");
        if (second>=60 || second<0)
            throw new IllegalArgumentException("Hatalı saniye girişi");

        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public Time(Time time){
        this(time.hour,time.minute, time.second);
    }

    public void setTime(int hour,int minute,int second){
        if(hour>=24 || hour < 0)
            throw new IllegalArgumentException("Hatalı bir saat girişi!");
        if (minute>=60 || minute<0)
            throw new IllegalArgumentException("Hatalı dakika girişi!");
        if (second>=60 || second<0)
            throw new IllegalArgumentException("Hatalı saniye girişi");

        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public void sethour(int hour) {
        if (hour >= 24 || hour < 0)
            throw new IllegalArgumentException("Hatalı bir saat girişi!");

        this.hour=hour;
    }

    public void setMinute(int minute) {
        if (minute >= 60 || minute < 0)
            throw new IllegalArgumentException("Hatalı dakika girişi!");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 60 || second < 0)
            throw new IllegalArgumentException("Hatalı sanie girişi!");
        this.second = second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    public String toStringg(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() ==0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(),getSecond(),
                (getHour()>12 ? "PM" : "AM")
        );
    }

}
