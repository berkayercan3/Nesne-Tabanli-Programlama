package OOPENUM;

public class RestaurantManagementSystem {

    public enum SiparisDurumu {
        HAZIRLANIYOR("Sipariş Hazırlanıyor"),
        YOLDA("Yolda"),
        TESLIM_EDILDI("Teslim Edildi"),
        IPTAL_EDILDI("İptal Edildi");

        private final String durumMesaji;

        SiparisDurumu(String durumMesaji) {
            this.durumMesaji = durumMesaji;
        }

        public String getDurumMesaji() {
            return durumMesaji;
        }
    }

    public static void main(String[] args) {
        Siparis siparis1 = new Siparis("Pizza", 25.99);
        siparis1.setDurum(SiparisDurumu.HAZIRLANIYOR);
        System.out.println("Sipariş Durumu: " + siparis1.getDurum().getDurumMesaji());

        Siparis siparis2 = new Siparis("Hamburger", 12.99);
        siparis2.setDurum(SiparisDurumu.YOLDA);
        System.out.println("Sipariş Durumu: " + siparis2.getDurum().getDurumMesaji());
    }
}

class Siparis {
    private String urun;
    private double fiyat;
    private RestaurantManagementSystem.SiparisDurumu durum;

    public Siparis(String urun, double fiyat) {
        this.urun = urun;
        this.fiyat = fiyat;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public RestaurantManagementSystem.SiparisDurumu getDurum() {
        return durum;
    }

    public void setDurum(RestaurantManagementSystem.SiparisDurumu durum) {
        this.durum = durum;
    }
}
