public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("", "", 1973, 0.0);
        System.out.println("OGR-1: " + ogrenci1.getAd() +" "+ ogrenci1.getBolum()+" "+ ogrenci1.getOgrNo()+" "+ ogrenci1.getGano());

        Ogrenci ogrenci2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 0.0);
        System.out.println("OGR-2: " + ogrenci2.getAd() +" "+ ogrenci2.getBolum()+" "+ ogrenci2.getOgrNo()+" "+ ogrenci2.getGano());

        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh", 1985, 0.0);
        System.out.println("OGR-2: " + ogrenci3.getAd() +" "+ ogrenci3.getBolum()+" "+ ogrenci3.getOgrNo()+" "+ ogrenci3.getGano());

        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik Elektronik Müh", 2020, 1.98);
        System.out.println("OGR-2: " + ogrenci4.getAd() +" "+ ogrenci4.getBolum()+" "+ ogrenci4.getOgrNo()+" "+ ogrenci4.getGano());

        System.out.println("3. öğrencinin ödeyeceği harç:" + ogrenci3.harcHesapla(6));
        System.out.println("4. öğrencinin ödeyeceği harç:" + ogrenci4.harcHesapla(8,1));

    }
}