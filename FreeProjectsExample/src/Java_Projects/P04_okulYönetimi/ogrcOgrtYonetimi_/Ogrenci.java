package Java_Projects.P04_okulYönetimi.ogrcOgrtYonetimi_;

public class Ogrenci extends Kisi {
    private String sinif;
    private String ogrenciNo;

    public Ogrenci() {

    }
    public Ogrenci(String adSoyad, String kimlikNo, int yas, String sinif, String ogrenciNo) {
        super(adSoyad, kimlikNo, yas);
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " Sınıf: " + sinif +
                ", Öğrenci No: " + ogrenciNo;
    }
}
