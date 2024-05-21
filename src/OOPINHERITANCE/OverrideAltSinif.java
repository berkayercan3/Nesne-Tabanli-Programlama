package OOPINHERITANCE;

class OverrideAltSinif extends OverrideAnaSinif {
    // Üst sınıftaki metodu override ediyoruz
    @Override
    void selam() {
        System.out.println("Merhaba, Ben alt sınıfın metodu!");
    }
}