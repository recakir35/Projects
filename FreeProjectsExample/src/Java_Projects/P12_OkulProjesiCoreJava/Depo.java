package Java_Projects.P12_OkulProjesiCoreJava;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";

        do {
            System.out.println("============YILDIZ KOLEJİ================\n" +
                    "=====================ANA MENÜ============\n" +
                    "\t1-Okul Bilgilerini Görümtüle\n" +
                    "\t2-Öğretmen Menü\n" +
                    "\t3-Öğtenci Menü\n" +
                    "\tQ-Çıkış");
            System.out.println("Lütfen Menüden tercihinizi yapınız: ");
            tercih = scan.nextLine().toUpperCase();


            switch (tercih) {
                case "1":
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2":
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Lütfen geçerli bir tercih giriniz: ");
            }
        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void kimlikNoileSilme() {
        System.out.println("Silinecek Öğretmen Tc Giriniz: ");
        String silinecekKimlikNo = scan.nextLine();

        String silinecekValue = Ogretmen.ogretmenlerMap.get(silinecekKimlikNo);

        String sonucValue = Ogretmen.ogretmenlerMap.remove(silinecekKimlikNo);
        try {
            boolean sonuc = sonucValue.equalsIgnoreCase(silinecekValue);
        } catch (Exception e) {
            System.out.println("Verilen Kimlik noda öğretmen bulunamadı.");
        }
        System.out.println("İstenen Öğretmen Silindi");
    }


    public static void ogretmenEkleme() {
        System.out.println("Tc No: ");
        String tcNo = scan.nextLine();
        System.out.println("İsim : ");
        String isim = scan.nextLine();
        System.out.println("Soyisim: ");
        String soyisim = scan.nextLine();
        System.out.println("Doğum Yılı: ");
        String dyili = scan.nextLine();
        System.out.println("Branş: ");
        String brans = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dyili + ", " + brans + ", ";
        Ogretmen.ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() {
        System.out.println("Aranan Öğretmenin Branşı: ");
        String istenenSoyisim = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenEnrySet = Ogretmen.ogretmenlerMap.entrySet();

        System.out.println("============YILDIZ KOLEJİ================\n" +
                "=====================ANA MENÜ============\n" +
                "Tc No      İsim     Soyisim    D.Yılı   Brans");
        for (Map.Entry<String, String> each : ogretmenEnrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split("");
            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%-11s %-6s %-8s %-4s %-1s\n", eachKey, eachValueArr[0], eachKey, eachValueArr[1], eachKey, eachValueArr[2], eachKey, eachValueArr[3]);
            }
        }
    }

    public static void soyisimOgretmenBulma() {
        System.out.println("Aranan Öğretmenin Soyismi: ");
        String istenenSoyisim = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenEnrySet = Ogretmen.ogretmenlerMap.entrySet();

        System.out.println("============YILDIZ KOLEJİ================\n" +
                "=====================ANA MENÜ============\n" +
                "Tc No      İsim     Soyisim    D.Yılı   Brans");
        for (Map.Entry<String, String> each : ogretmenEnrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split("");
            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-11s %-6s %-8s %-4s %-1s\n", eachKey, eachValueArr[0], eachKey, eachValueArr[1], eachKey, eachValueArr[2], eachKey, eachValueArr[3]);
            }
        }
    }

    public static void ogretmenYazdir() {

        System.out.println("============YILDIZ KOLEJİ================\n" +
                "=====================ANA MENÜ============\n");
        System.out.printf("%-13s %-10s %-10s %-8s %-8s\n", "Tc No", "İsim", "Soyisim", "D.Yılı", "Brans");

 //       for (Map.Entry<String, String> each: Ogretmen.ogretmenlerMap.entrySet()){
 //           System.out.printf("%-13s %-10s %-10s %-8s %-8s\n", each.getValue().                               , each.getValue().
 //                   Ogretmen.ogretmenlerMap.get(each).values().each.getValue().ValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
        }


    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("============YILDIZ KOLEJİ================\n" +
                "\t\t Adres: " + Okul.adres +
                "\t\t Telefon: " + Okul.telefon + Okul.telefon);
        Thread.sleep(5000); // Bekletme yapar

    }

    public static void projeDurdur() {
        System.out.println("Okul Projesinden çıktınız...");
        System.exit(0); // Çıkış İşlemi yapar
    }
}
