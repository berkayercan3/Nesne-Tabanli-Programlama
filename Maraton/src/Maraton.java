public class Maraton {
    private String[] isim;
    private int[] derece;

    public Maraton(String[] isim, int[] derece) {
        this.isim = isim;
        this.derece = derece;
    }

    public String[] getIsim() {
        return isim;
    }

    public void setIsim(String[] isim) {
        this.isim = isim;
    }

    public int[] getDerece() {
        return derece;
    }

    public void setDerece(int[] derece) {
        this.derece = derece;
    }

    public int getMinimum() {
        for (int i = 0; i < derece.length - 1; i++) {
            for (int j = 0; j < derece.length - i - 1; j++) {
                if (derece[j] > derece[j + 1]) {
                    int temp = derece[j];
                    derece[j] = derece[j + 1];
                    derece[j + 1] = temp;

                    String temp1 = isim[j];
                    isim[j] = isim[j + 1];
                    isim[j + 1] = temp1;
                }
            }
        }
        return derece[0];
    }

    public int ikinci() {
        return derece[1];
    }

    public int üçüncü() {
        return derece[2];
    }

    public String birinciKisi() {
        return isim[0];
    }

    public String ikinciKisi() {
        return isim[1];
    }

    public String üçüncüKisi() {
        return isim[2];
    }

    public void sıralama() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] >= 200 && derece[i] <= 299) {
                a++;
            } else if (derece[i] >= 300 && derece[i] <= 399) {
                b++;
            } else {
                c++;
            }
        }

        System.out.println("200-299 arasında derece alan kişi sayısı: " + a);
        System.out.println("300-399 arasında derece alan kişi sayısı: " + b);
        System.out.println("Diğer derece aralığındaki kişi sayısı: " + c);
    }
    public void sınıflandırma() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] >= 200 && derece[i] <= 299) {
                a++;
            } else if (derece[i] >= 300 && derece[i] <= 399) {
                b++;
            } else {
                c++;
            }
        }

        System.out.println("A sınıfı: " + a);
        System.out.println("B sınıfı: " + b);
        System.out.println("C sınıfı: " + c);
    }
}
