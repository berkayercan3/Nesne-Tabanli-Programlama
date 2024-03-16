public class Main {

    public static void main(String[] args) {
        Car araba1 = new Car();
        araba1.carInfo();

        araba1.setCar(Color.BEYAZ, "Fiat", 1.6);
        araba1.carInfo();

        Car araba2 = new Car(Color.KIRMIZI, "Mazda", 1.0);
        araba2.carInfo();

        Car araba3 = new Car();
        araba3.carInfo();

        Car araba4 = new Car(Color.SARI);
        araba4.carInfo();

        Car araba5 = new Car(Color.MAVİ, "Togg");
        araba5.carInfo();

        Modified.modifiedCar(araba5, Color.KIRMIZI);
        araba5.carInfo();

        Modified.modifiedCar(araba4, Color.KIRMIZI);
        araba4.carInfo();

        System.out.println("Modifiye Edilen Araç Sayısı= " + Modified.getCount());
    }

}