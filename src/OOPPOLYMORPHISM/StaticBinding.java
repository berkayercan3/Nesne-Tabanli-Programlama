public class StaticBinding {
    public static void main(String[] args) {
        Animal animal = new Animal();
       // animal.privateMethod(); // Statik bağlama private olduğu için başka sınıfdan erişim olmaz
        Animal.staticMethod();  // Statik bağlama  static method olduğu için yeni bir nesne oluşturmadan da çağrılabilir
                                // o nedenle direk sınıf ismi ile çağırdık
        animal.finalMethod();   // Statik bağlama

        // Overloading örneği
        OverloadExample example = new OverloadExample();
        example.display(10);      // Statik bağlama
        example.display("Hello"); // Statik bağlama
    }
}

class Animal {
    private void privateMethod() {
        System.out.println("Animal private method");
    }

    static void staticMethod() {
        System.out.println("Animal static method");
    }

    final void finalMethod() {
        System.out.println("Animal final method");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class OverloadExample {
    void display(int num) {
        System.out.println("Number: " + num);
    }

    void display(String msg) {
        System.out.println("Message: " + msg);
    }
}
