package OOPINHERITANCE;

public class Sekil {
    double alan() {
        return 0;
    }
}

// Dikdörtgen sınıfı - extends ile Sekil sınıfından kalıtım yapar
class Dikdortgen extends Sekil {
    double genislik;
    double yukseklik;


    @Override // ovveride kullanrak alan() metodunun gerçekten üst sınıftan geçersiz kılınarak
    // (override edilerek) miras alındığı açıkça belirtilir.
    double alan() {
        return genislik * yukseklik;
    }
}

// Üçgen sınıfı - Sekil sınıfından kalıtım yapar
class Ucgen extends Sekil {
    double taban;
    double yukseklik;

    @Override //bir metodun üst sınıftan (veya arayüzden) geçersiz kılınarak (override edilerek) miras alındığını
                                    // belirtmek için kullanılır.
    double alan() {
        return (taban * yukseklik) / 2;
    }
}

 class Geometri {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.genislik = 5;
        dikdortgen.yukseklik = 3;
        System.out.println("Dikdörtgen Alanı: " + dikdortgen.alan());

        Ucgen ucgen = new Ucgen();
        ucgen.taban = 4;
        ucgen.yukseklik = 6;
        System.out.println("Üçgen Alanı: " + ucgen.alan());
    }
}
