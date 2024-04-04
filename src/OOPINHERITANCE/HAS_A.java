package OOPINHERITANCE;

public class HAS_A {

    class Motor {
        // Motor sınıfının özellikleri ve davranışları
    }

    class Araba {
        private Motor motor; // Araba sınıfı, Motor sınıfına sahiptir

        public Araba() {
            this.motor = new Motor(); // Araba sınıfı, Motor nesnesini içerir
        }
    }
}
