package Task;

import Java_Projects.P11_depoYonetimi_.Urun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T09_Printf {
    static List<String> urunListesi = new ArrayList<String>(Arrays.asList("1000", "Domates", "Ali Dayı", "Manav", "10", "2"));

    public static void main(String[] args) {
        Urun urun = new Urun();
        System.out.println("   ***   ÜRÜN LİSTESİ   ***   ");
        System.out.println("İD     ÜRÜN İSMİ   ÜRETİCİ   BİRİM   MİKTAR   RAF");
        System.out.println("____   _________   _______   _____   ______   ___");
        System.out.printf("%-6.4s %-11.6s %-9.8s %-7.5s %-8.3s %-5.2s", urunListesi.get(0), urunListesi.get(1), urunListesi.get(2), urunListesi.get(3), urunListesi.get(4), urunListesi.get(5));
    }
}

