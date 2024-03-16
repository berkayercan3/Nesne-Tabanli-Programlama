public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private int ogrNo;
    private double gano;
    private int bolumKodu;

    public Ogrenci(String ad, String bolum, int girisYili, double gano) {
        setAd(ad);
        setBolum(bolum);
        setGirisYili(girisYili);
        bolumKoduBelirle(bolum);
        setOgrNo(ogrNoUret(girisYili, bolumKodu));
        setGano(gano);
    }

    public String getAd() {
        if (ad == null || ad.isEmpty())
            return null;
        else
            return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        if (bolum == null || bolum.isEmpty())
            return null;
        else
            return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    private void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
        }
        this.gano = gano;
    }

    private void bolumKoduBelirle(String bolum) {
        boolean bilgisayar = bolum.toLowerCase().contains("bilgisayar");
        boolean elektirik = bolum.toLowerCase().contains("elektrik");
        boolean makine = bolum.toLowerCase().contains("makine");

        if (bilgisayar)
            bolumKodu = 101;
        else if (elektirik)
            bolumKodu = 202;
        else if (makine)
            bolumKodu = 303;
        else
            bolumKodu = 104;
    }

    private int ogrNoUret(int girisYili, int bolumKodu) {
        int girisSırası = 1;
        return Integer.parseInt(String.format("%d%03d%03d", girisYili, bolumKodu, girisSırası));
    }

    public double harcHesapla(int dersSayisi) {
        return dersSayisi * 80;
    }

    public double harcHesapla(int dersSayisi, int uzatilanYil) {
        return dersSayisi * 80 + uzatilanYil * 320;
    }
}
