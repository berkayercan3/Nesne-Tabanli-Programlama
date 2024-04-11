package OOPSTRING;

public class StringMiscellaneous2 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "  spaces ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        //testh method replace
        System.out.printf("s1 replace 'l' with 'L'%n , new s1= %s%n", s1.replace('l','L'),s1);

        //test toLowerCase and toUpperCase
        System.out.printf("s2 toLowerCase,%s%nnew s2 = %s%n%n", s2.toLowerCase(),s2);
        System.out.printf("s3 toUpperCase,%s%nnew s3 = %s%n%n", s3.toUpperCase(),s3);

        //test trim method  boşlukları kırpar
        System.out.printf("s3 trim %s%n%n" , s3.trim());

        //test toCharArray bir stringin charlarını dizi olarak döndürmeyi sağlar
        char[] array=s1.toCharArray();

        for(char character: array){
            System.out.println(character);
        }

    }
}
