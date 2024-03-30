package OOPCOMPOSITION;

public class Main {
    public static void main(String[] args){
        // Date sınıfının örneklerini oluşturalım
        Date date1 = new Date(3, 12, 2022);
        Date date2 = new Date(2, 29, 2024); // Artık yıl
        Date date3 = new Date(2, 29, 2023); // Artık yıl değil

        // toString metodu çağrılarak tarihler yazdırılır
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
