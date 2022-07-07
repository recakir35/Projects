package Java_Projects.P12_OkulProjesiCoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogretmen {
    static Map<String, String> ogretmenlerMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("12345678912", "Ali, Yan, 1978, Fizik");
        ogretmenlerMap.put("12345678913", "Mehmet, Yan, 1998, Matematik");
        ogretmenlerMap.put("12345678914", "Can, Çakır, 1973, Biyoloji");
        ogretmenlerMap.put("12345678915", "Cem, Çakır, 1988, Geometri");
        ogretmenlerMap.put("12345678916", "Faik, Yandaş, 1995 Tarih");
        ogretmenlerMap.put("12345678917", "Sevcan, Verir, 2000, Edebiyat");
        ogretmenlerMap.put("12345678918", "Faik, Solmaz, 2001, Beden");
    }
    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";

        do {
            System.out.println("============YILDIZ KOLEJİ================\n" +
                    "=====================ANA MENÜ============\n" +
                    "\t1-Öğretmenler Listesi Yazdır\t\t\n" +
                    "\t2-Soyisimden Öğretmen Bulma\n" +
                    "\t3-Branstan Öğretmen Bulma\n" +
                    "\t4-Bilgilerini Girerek Öğretmen Bulma\n" +
                    "\t5-Kimlik No ile Kayıt Silme\n" +
                    "\tA-Ana Menü\n" +
                    "\tQ-Çıkış");
            System.out.print("Lütfen Menüden tercihinizi yapınız: ");
            tercih = scan.nextLine().toUpperCase();


            switch (tercih) {
                case "1":
                    Depo.ogretmenYazdir();
                    break;
                case "2":
                    Depo.soyisimOgretmenBulma();
                    break;
                case "3":
                    Depo.branstanOgretmenBulma();
                    break;
                case "4":
                    Depo.ogretmenEkleme();
                    break;
                case "5":
                    Depo.kimlikNoileSilme();
                    break;
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.print("Lütfen geçerli bir tercih giriniz: ");
            }
        } while (!tercih.equalsIgnoreCase("q"));
    }

}
