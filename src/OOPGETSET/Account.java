package OOPGETSET;
public class Account {

    // private bir değişken oluşturulduğu için get ve set metotlarına ihtiyaç duyduk
    //get ve set metotları public olarak tanımlanır ki diğer sınıflarca erişilebilir durumda olsun
    //Getter-Setter Avantajları: Erişim Kontrolü,Encapsulation (Kapsülleme),Esneklik,Kod Bakımı Kolaylığı
    private String name; // private olarak oluşturmak sadece bu sınıf içerisinde erişimi sağlıyor

    public String getName(){ // getName public olarak oluşturuldu
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
