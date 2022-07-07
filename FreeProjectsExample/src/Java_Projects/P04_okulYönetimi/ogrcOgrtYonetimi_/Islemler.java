package Java_Projects.P04_okulYönetimi.ogrcOgrtYonetimi_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static List<Kisi> ogretmenListesi = new ArrayList<>();
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n====================================" + "\n1- ÖĞRENCİ İŞLEMLERİ\n2- ÖĞRETMEN İŞLEMLERİ\nQ- ÇIKIŞ");
        System.out.print("Lütfen Seçiminizi yapınız: ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "ÖĞRENCİ";
                islemMenu();
                break;
            case "2":
                kisiTuru = "ÖĞRETMEN";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız.");
                girisPaneli();
                break;
        }
    }

    private static void islemMenu() {
        System.out.println("============= İŞLEMLER =============\r\n1-EKLEME\r\n2-ARAMA\r\n3-LİSTELEME\r\n4-SİLME\r\nQ-ÇIKIŞ");
        System.out.print("Lütfen Seçiminizi yapınız: ");
        String islemSecim = scan.next().toUpperCase();

        switch (islemSecim) {
            case "1":
                ekle();
                break;
            case "2":
                arama();
                break;
            case "3":
                listele();
                break;
            case "4":
                sil();
                break;
            case "Q":
                girisPaneli();
                break;
            default:
                System.out.println("Hatalı Seçim yaptınız: ");
                islemMenu();
                break;
        }
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " silme sayfası   ***");
        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("ÖĞRENCİ")) {
            System.out.print("Lütfen Silinecek Öğrencinin Kimlik Nosunu giriniz: ");
            String silinecekKimlikNo = scan.next();
            scan.nextLine();
            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                    System.out.println("Ad Soyad: " + each.getAdSoyad());
                    ogrenciListesi.remove(each);// öğrenciliniyor.
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Aradığınız öğrenci Bulunamadı");
            }
            islemMenu();
        } else {
            System.out.print("Lütfen Silinecek Öğretmen Kimlik Nosunu giriniz: ");
            scan.nextLine();
            String kimlikNo = scan.nextLine();
            for (Kisi each : ogretmenListesi) {
                if (kimlikNo.equals(each.getKimlikNo())) {
                    System.out.println("Ad Soyad " + each.getAdSoyad());
                    ogretmenListesi.remove(each);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Aradığınız öğretmen bulunamadı");
            }
            islemMenu();
        }

    }

    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***");
        if (kisiTuru.equalsIgnoreCase("ÖĞRENCİ")) {
            System.out.println(ogrenciListesi);
            islemMenu();
        } else {
            System.out.println(ogretmenListesi);
            islemMenu();
        }
    }

    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");

        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("ÖĞRENCİ")) {
            System.out.print("Lütfen Aranacak Öğrencinin Kimlik Nosunu giriniz: ");
            String arananKimlikNo = scan.next();
            scan.nextLine();
            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("Ad Soyad: " + each.getAdSoyad());
                    System.out.println("Ad Soyad: " + each.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Aradığınız öğrenci Bulunamadı");
            }
            islemMenu();
        } else {
            System.out.print("Lütfen Aranacak Öğretmen Kimlik Nosunu giriniz: ");
            scan.nextLine();
            String kimlikNo = scan.nextLine();
            for (Kisi each : ogretmenListesi) {
                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)) {
                    System.out.println("Ad Soyad " + each.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Aradığınız öğretmen bulunamadı");
            }
            islemMenu();
        }
    }


    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        scan.nextLine();
        System.out.print("Ad Soyad giriniz: ");
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik No giriniz: ");
        String kimlikNo = scan.nextLine();
        System.out.print("Yas giriniz: ");

        int yas = scan.nextInt();
        if (kisiTuru.equals("ÖĞRENCİ")) {
            System.out.print("Öğrenci No giriniz: ");
            String ogrenciNo = scan.next();
            scan.nextLine();
            System.out.print("Sınıf giriniz: ");
            String sinif = scan.nextLine();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, sinif, ogrenciNo);
            ogrenciListesi.add(ogrenci);
            islemMenu();
        } else {
            System.out.print("Bölüm giriniz: ");
            String bolum = scan.nextLine();
            scan.nextLine();
            System.out.print("Sicil No giriniz: ");
            String sicilNo = scan.nextLine();
            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenListesi.add(ogretmen);
            islemMenu();
        }

    }

    private static void cikis() {
        System.out.println("Yine bekleriz...");
    }
}
