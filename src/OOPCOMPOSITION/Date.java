package OOPCOMPOSITION;

public class Date {

    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int month,int day , int year){
        if(month>12 || month<=0)
            throw new IllegalArgumentException("month (" + month +") 1-12 aralığında olmalı!");
        if (day <= 0 || (month != 2 && day > daysPerMonth[month]) || (month == 2 && day > 29 && (year % 400 != 0 && (year % 4 !=0 || year % 100 == 0)))) {
            throw new IllegalArgumentException("day (" + day +") belirtilen aralık dışında!");
        }
        if (month==2 && day == 29 && !(year % 400 == 0 || (year % 4 ==0 && year %100 != 0)))
            throw new IllegalArgumentException("day (" + day +") belirtilen aralık dışında!");

        this.day=day;
        this.month=month;
        this.year=year;
        System.out.printf("%s%n",this);
    }

    public String toString(){
        return String.format("%d/%d/%d",day,month,year);
    }

}
