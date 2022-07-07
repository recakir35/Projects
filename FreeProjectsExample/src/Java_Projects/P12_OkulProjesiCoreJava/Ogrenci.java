package Java_Projects.P12_OkulProjesiCoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogrenci {
    static Scanner scan = new Scanner(System.in);
    static Map<String,String> ogrenciMap=new HashMap<>();

    public static void feykOgrenciEkle(){

    }
    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";

        do {
            System.out.println("============YILDIZ KOLEJİ================\n" +
                    "=====================ANA MENÜ============\n" +
                    "\t1-Öğrenciler Listesi Yazdır\t\t\n" +
                    "\t2-Soyisimden Öğrenci Bulma\n" +
                    "\t3-Branstan Öğrenci Bulma\n" +
                    "\t4-Bilgilerini Girerek Öğrenci Bulma\n" +
                    "\t5-Kimlik No ile Kayıt Silme\n" +
                    "\tA-Ana Menü\n" +
                    "\tQ-Çıkış");
            System.out.print("Lütfen Menüden tercihinizi yapınız: ");
            tercih = scan.nextLine().toUpperCase();


            switch (tercih) {
                case "1":
                   // Depo.ogretmenYazdir();
                    break;
                case "2":
                    //Depo.soyisimOgretmenBulma();
                    break;
                case "3":
                   // Depo.branstanOgretmenBulma();
                    break;
                case "4":
                   // Depo.ogretmenEkleme();
                    break;
                case "5":
                   // Depo.kimlikNoileSilme();
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
