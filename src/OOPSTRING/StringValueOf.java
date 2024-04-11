package OOPSTRING;

import java.io.FilterOutputStream;

public class StringValueOf {
    public static void main(String[] args){
        //Primitive prgramlamda 'temel' anlamına gelir ve javadaki temel veri tiplerini ifade
        //etmek için kullanılır ( int,double,boolean,char,short,byte,float..vb)
        char[] chars = {'a','b','c','d'};
        int i = 50000;
        long l = 10000000000L; //L suffiex indicates long
        float f = 3.14f; // f suffiex indicates float
        double d = 2.71828;
        char c = 'A';
        boolean flag = true;

        System.out.printf("char array = %s%n",String.valueOf(chars));
        System.out.printf("part of char array = %s%n",String.valueOf(chars,2,2));
        System.out.printf("int = %s%n",String.valueOf(i));
        System.out.printf("long = %s%n",String.valueOf(l));
        System.out.printf("float = %s%n",String.valueOf(f));
        System.out.printf("double = %s%n",String.valueOf(d));
        System.out.printf("char = %s%n",String.valueOf(c));
        System.out.printf("boolean = %s%n",String.valueOf(flag));

         /*
         Java'da String.valueOf() metodu, belirtilen değeri bir String nesnesine dönüştürür.
         Bu metod, farklı veri tiplerinden (int, double, boolean, vb.) veya nesnelerden (Object)
         bir String oluşturmanıza olanak tanır.
         */

    }
}
