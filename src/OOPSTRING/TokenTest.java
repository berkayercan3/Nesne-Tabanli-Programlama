package OOPSTRING;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args){
        /*
        token işaret anlamına gelir yani mesela bir cümleyi parçalamak istediğimiz
        zaman kullanmak istediğimiz ayracı ifade eder buradaki örnekte boşluk tercih ettik
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press enter");
        String sentence =scanner.nextLine();

        String[] str = sentence.split(" ");
        System.out.printf("Number of elements = %d%nThe tokens are:%n",str.length);
        for(String strs: str){
            System.out.println(strs);
        }
    }
}
