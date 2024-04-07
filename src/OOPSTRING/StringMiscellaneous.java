package OOPSTRING;

public class StringMiscellaneous {
    public static void main(String[] args){
        String s1 = "Hello There";
        char[] charArray = new char[5];

        System.out.printf("s1= %s%n",s1);

        //length method
        System.out.printf("s1 length = %d\n",s1.length());

        //s1 string reverse
        System.out.printf("s1 reverse of :");
        //sondan basladık yazmaya
        for (int i = s1.length()-1; i>=0 ; i--) {
            System.out.printf("%c", s1.charAt(i));
        }

        //copy characters from string into charArray
        s1.getChars(0,5,charArray,0);
        //srcBegin(ilk değer) kaynak dizide kopyalanmaya başlanacak indis
        //srcEnd(son değer) kaynak dizide kopyalanmayı bitirecek bitiş indisi
        //dst hedef char
        //dstBegin  hedef karakter dizisindeki hedef konum
        System.out.printf("\nThe character array is : ");
        for(char character: charArray){
            System.out.print(character);
        }
    }
}
