package OOPINHERITANCE;

public class IS_A {

    class Hayvan {
        // Hayvan sınıfının özellikleri ve davranışları
    }

    class Kedi extends Hayvan { // extend kullanılarak aslında kalıtım yapılmış oldu
        // Kedi sınıfının özellikleri ve davranışları,
        // Hayvan sınıfından devralınanlar da dahil
    }

    class Köpek extends Hayvan {
        // Köpek sınıfının özellikleri ve davranışları,
        // Hayvan sınıfından devralınanlar da dahil
    }
}
