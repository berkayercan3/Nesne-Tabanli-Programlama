package OOPPOLYMORPHISM;

class Animal{
    public void makeSound(){
        System.out.println("animal soundd");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog sound");
    }

    public void bark(){
        System.out.println("Dog barks");
    }
}

public class DowncastingAndUpcasting {

    public static void main(String[] args){
        Animal animal = new Dog(); //UPCASTING islemi yapıldı upcasting ile üst sınıf referansı dog nesnesine sahip oldu
        animal.makeSound();
        //animal.bark(); -> çalışmaz

        //downcasting yapılmadan önce instance of ile animal referansının dog türünde olup olmadığı kontrol edildi
        if(animal instanceof Dog){
            Dog dog = (Dog) animal; //DOWNCASTİNG üst sınıf referansını alt sınıf türüne dönüştürdük
            dog.bark();
        }

        Dog dog1 = new Dog();
        dog1.makeSound(); //Eğer dog sınıfında makeSound bulunmasaydsı animal sınıfındaki makeSound aktif olacaktı ve
                            // animal sound şeklinde çıktı verecekti kalıtım yüzünden ama aynı yöntemden dog sınıfında
                                // da bulunduğu için dog sınıfındaki yöntem @override edilerek üst sınıftaki yöntem
                                    //ezilir ve dog sınıfındaki makesound çalışır.
    }
}

