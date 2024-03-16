public class Car {
    private static int count;
    private String model;
    private Color color;
    private double motor;

    public Car(Color color, String model) {
        this.color = color;
        this.model = model;
        motor =0.0;
        count++;
    }

    public Car() {
        this.color = Color.BEYAZ;
        this.model = "Belli Değil";
        this.motor=0.0;
        count++;
    }

    public Car(Color color) {
        this.color = color;
        this.model = "Belli Değil";
        this.motor=0.0;
        count++;
    }

    public Car(Color color, String model, double motor) {
        this.color = color;
        this.model = model;
        this.motor = motor;
        count++;
    }

    public void carInfo() {
        System.out.println("Renk: " + color.getAvatar() + " \nModel: " + model + "\nMotor: " + motor);
        System.out.println("Üretilen toplam araba adedi : " +getCount());
        System.out.println();
    }

    public void setCar(Color color, String model, double motor) {
        this.color = color;
        this.model = model;
        this.motor = motor;
    }

    public void changeColor(Color color){
        System.out.println("Renk Değişitiriliyor");
        this.color = color;
    }

    public static int getCount(){
        return count;
    }
}
