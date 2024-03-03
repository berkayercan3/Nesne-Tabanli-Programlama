public class Main {
    public static void main(String[] args) {
        int[] sure = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] kisi = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        Maraton yaris = new Maraton(kisi, sure);

        System.out.printf("Birinci: %s %d\n", yaris.birinciKisi(), yaris.getMinimum());
        System.out.printf("İkinci: %s %d\n", yaris.ikinciKisi(), yaris.ikinci());
        System.out.printf("Üçüncü: %s %d\n", yaris.üçüncüKisi(), yaris.üçüncü());
        yaris.sıralama();

        System.out.println("Sınıflandırma:");
        yaris.sınıflandırma();
    }
}
