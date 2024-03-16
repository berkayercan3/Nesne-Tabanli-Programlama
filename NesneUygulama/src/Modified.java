public class Modified {
    private static int count = 0;

    public static void modifiedCar(Car car, Color color) {
        car.changeColor(color);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
