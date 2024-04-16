package OOPSTRING;

public class ValidateInput {
    //.matches() yöntemi karşılaştırıp uygunluğunu kontrol eder
        public static boolean validateFirstName (String firstName){
            return firstName.matches("[A-Z][a-zA-Z]*");
        }
        /*
        [A-Z] ile ismin ilk harfinin büyük olacağını
        [a-zA-Z] ifadesi geri kalan kısmın küçük veya büyük harf olabileceğini
        * ise en az 1 karakter olması gerektiğini belirtir
        tüm bunlara uygunsa method true döndürür
        */
        public static boolean validateLastName (String lastName){
            return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
        }

        public static boolean validateAddress (String address){
            return address.matches("\\d+\\s+([a-zA-Z]+| [a-zA-Z]+\\s[a-zA-Z]+)");
        }
        //   \\d ifadesi, herhangi bir rakamı temsil eder, + ise bu desenin bir veya daha fazla
        // kez tekrarlanabileceğini belirtir.
        //   \\s ifadesi, herhangi bir boşluk karakterini temsil eder, + ise bu desenin bir veya daha
        //fazla kez tekrarlanabileceğini belirtir.
        //  '|' 2 farklı stringi birleştirir

    public static boolean validateZip (String zip){
        return zip.matches("\\d{5}");
    }

    public static boolean validatePhone (String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
    /*
    Bu düzenli ifade, bir telefon numarasının 3 haneli bir alan kodu (1 ile 9 arasında bir rakamdan
    oluşan ilk hane, ardından iki rakamdan oluşan alan kodu), bir tire, 3 haneli bir merkez kodu,
    bir tire ve son olarak 4 haneli bir abone numarası olmasını bekler. Örneğin, "555-555-5555"
    gibi bir telefon numarası bu desene uygun olacaktır.
    */
}


