package OOPSTRING;

public class StringConcatenation {
    public static void main(String[] args){
        String s1 = "hello ";
        String s2 = "world";

        System.out.printf("s1 = %s%n",s1);
        System.out.printf("s2 = %s%n",s2);
        System.out.printf("s1 and s2 concat = %s%n",s1.concat(s2));
        System.out.printf("after concat s1 = %s",s1);
    }
}
