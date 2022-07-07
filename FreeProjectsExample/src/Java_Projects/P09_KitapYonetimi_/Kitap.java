package Java_Projects.P09_KitapYonetimi_;

import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private int kitapNo = 1000;
    private String kitapAdi;
    private String yazarAdi;
    private double kitapFiyat;
    static List<Kitap> kitapListesi = new ArrayList<>();

    public Kitap() {
    }

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo++;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(double kitapFiyat) {

        this.kitapFiyat = kitapFiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }
}
