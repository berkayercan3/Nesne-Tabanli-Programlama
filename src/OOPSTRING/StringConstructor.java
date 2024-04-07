package OOPSTRING;

public class StringConstructor {
    public static void main(String[] args){
        char[] helloWorld = {'h','e','l','l','o',' ','w','o','r','l','d'};

        String c = new String("hello");

        String s1 = new String(c);
        String s2 = new String(helloWorld);
        String s3= new String(helloWorld,6,5); // 6. kısımdan itibaren 5 tane bölmedeki ifadeyi al
                                                            //çıktı: world

        System.out.printf("s1=%s%n s2=%s%n s3=%s%n s4=%s%n",s1,s2,s3,s3); //%s string değerler için, %d doğal sayılar
                                                                                //için.
    }
}
