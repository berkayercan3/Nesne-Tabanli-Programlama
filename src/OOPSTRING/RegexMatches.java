package OOPSTRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args){
        //create regular expression
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d"); // pattern ile bir desen oluşturulur karşılaştırma yapmak için

        String string1 = "Jane's birthday is 05-12-75\n" +
                "Dave's birthday is 11-04-68\n" +
                "John's birthday is 04-28-73\n"+
                "Joe's birthday is 12-17-77";

        // match regular expression to string and print matches
        Matcher matcher = expression.matcher(string1); // matcher metni tarar ve eşleşmeleri bulur

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
