class Animall {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animall{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animall animal = new Dog(); // Upcasting
        animal.makeSound(); // Dinamik bağlama çıktı " Dog barks"
    }
}
