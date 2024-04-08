package OOPSTRING;

public class StringStartEnd {
    public static void main(String[] args){
        String[] strings = {"started","starting","ended","ending"};

        //test method startsWith
        for ( String string : strings) {
            if (string.startsWith("st"))
                System.out.printf("%s starts with st \n",string);
        }

        //test method startsWith starting from position
        for ( String string : strings) {
            if (string.startsWith("art",2))
                System.out.printf("%s starts with art at position 2\n",string);
        }

        //test method endsWith
        for ( String string : strings) {
            if (string.endsWith("ed"))
                System.out.printf("%s ends with ed \n",string);
        }
    }
}
