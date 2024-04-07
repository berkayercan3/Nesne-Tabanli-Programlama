package OOPSTRING;

import javax.sound.midi.SysexMessage;

public class StringCompare {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = "merhaba";
        String s3 = "happy birthday";
        String s4 = "Happy Birthday";

        System.out.printf("S1=%s\nS2=%s\nS3=%s\nS4=%s\n",s1,s2,s3,s4);

        //test for equality
        if(s1.equals("hello"))
            System.out.println("\ns1 equals hello\n");
        else
            System.out.println("s1 does not equals hello\n");

        //test for equals with ( == )
        if(s1 == "hello")
            System.out.println("s1 is the same object as hello\n");
        else
            System.out.println("s1 is not the same object as hello\n");
        /*Aynı değerleri içeren iki AYRI nesne == ile
        karşılaştırıldığında sonuç yanlış olacaktır. Aynı içeriğe
        sahip olup olmadıklarını belirlemek için nesneleri
        karşılaştırırken, equals() kullanılır*/

        //test for equality (ignore case)
        if(s3.equalsIgnoreCase(s4)) //büyük küçük harf görmezden gelme
            System.out.printf("%s equals %s with case ignored\n",s3,s4);
        else
            System.out.printf("%s not equals %s with case ignored\n",s3,s4);

        //test compare
        System.out.printf("%nS1.compareTo(S2) is %d",s1.compareTo(s2));
        System.out.printf("%nS2.compareTo(S1) is %d",s2.compareTo(s1));
        System.out.printf("%nS1.compareTo(S1) is %d",s1.compareTo(s1));
        System.out.printf("%nS3.compareTo(S4) is %d",s3.compareTo(s4));
        System.out.printf("%nS4.compareTo(S3) is %d\n",s4.compareTo(s3));

        //test regionMatches(case sensitive)
        if(s3.regionMatches(0,s4,0,5))
            System.out.println("\nFirst 5 characters of s3 and s4 match");
        else
            System.out.println("\nFirst 5 characters of s3 and s4 not match");

        //test regionMatches(ignore case)
        if(s3.regionMatches(true,0,s4,0,5))
            System.out.println("Firs 5 characters of s3 and s4  match with case ignored");
        else
            System.out.println("Firs 5 characters of s3 and s4  fo not match");






    }
}
