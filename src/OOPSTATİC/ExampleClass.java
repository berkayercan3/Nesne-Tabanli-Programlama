package OOPSTATİC;

 /*Bir static metot, diğer static metotları ve static değişkenleri (aynı sınıftaki) doğrudan çağırabilir.
Static metotlara nesne kullanmadan erişilebilir.
Bir static metot, sınıfın örnek değişkenlerine ve metotlarına erişmek için nesne kullanmalıdır

Genel olarak, "static" kelimesi bir değişkenin, metodu veya bloğun nesneye özgü olmayacağını,
yani sınıfa ait olduğunu belirtmek için kullanılır. */
public class ExampleClass{
    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("Static method çağrıldı");
    }
    int instanceVariable = 20;
    void instanceMethod() {
        System.out.println("Instance method çağrıldı");
    }

    // Static metot, sınıfın örnek değişkenlerine ve metotlarına erişmek için nesne kullanabilir.
    static void accessInstanceMembers() {
        // Sınıfın örnek bir nesnesini oluştur
        ExampleClass example = new ExampleClass();

        // Örnek değişkenlere eriş
        System.out.println("Instance variable: " + example.instanceVariable);

        // Örnek metoda eriş
        example.instanceMethod();
    }

    public static void main(String[] args) {
        // Static metodu doğrudan çağırabiliriz
        staticMethod();

        // Static değişkeni doğrudan çağırabiliriz
        System.out.println("Static variable: " + staticVariable);

        // Static metot, sınıfın örnek değişkenlerine ve metotlarına erişmek için nesne kullanabilir.
        accessInstanceMembers();
    }
}

