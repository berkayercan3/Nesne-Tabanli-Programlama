public enum Color {
    KIRMIZI("Yakut Kırmızısı",0),
    SARI("Civciv sarısı",1),
    MAVİ("Gökyüzü Mavisi",2),
    YEŞİL("Su Yeşili",3),
    BEYAZ("İnci Beyazı",4);
    private final String avatar;
    private final int renkKod;

    Color(String avatar, int renkKod) {
        this.avatar = avatar;
        this.renkKod = renkKod;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getRenkKod() {
        return renkKod;
    }




}
