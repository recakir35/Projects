package Java_Projects.P04_okulYönetimi.ogrcOgrtYonetimi_;

public class Kisi {
    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi() {

    }
    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return " Ad Soyad: " + adSoyad +
                ", Kimlik No: " + kimlikNo  +
                ", Yaş: " + yas ;
    }
}
