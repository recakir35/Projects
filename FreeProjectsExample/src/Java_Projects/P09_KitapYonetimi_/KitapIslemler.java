package Java_Projects.P09_KitapYonetimi_;

import java.util.Scanner;

public class KitapIslemler {
    static Scanner scan = new Scanner(System.in);
    static int kitapSayac = 0;

    static void menuPanel() {
        System.out.println("\t\t 1-Kitap Ekle\n" +
                "\t\t 2-Numara ile Kitap Goruntule\n" +
                "\t\t 3-Bilgi ile Kitap Goruntule\n" +
                "\t\t 4-Numara ile Kitap Sil\n" +
                "\t\t 5-Tum Kitaplari Listele\n" +
                "\t\t 6-Çıkış");
        System.out.print("\t\tLütfen Seçim yapınız: ");
        int secim = 0;
        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Lütfen seçim için menü başlarındaki rakamları giriniz.");
            menuPanel();
        }

        switch (secim) {
            case 1:
                KitapIslemler.kitapEkle();
                menuPanel();
                break;
            case 2:
                KitapIslemler.noKitapGoruntule();
                menuPanel();
                break;
            case 3:
                KitapIslemler.bilgiKitapGoruntule();
                menuPanel();
                break;
            case 4:
                kitapSil();
                menuPanel();
                break;
            case 5:
                kitaplistele();
                menuPanel();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız.");
                menuPanel();
                break;
        }
    }

    private static void kitaplistele() {
        int snNo = 1;
        System.out.println("*** SİSTEMDE KAYITLI KİTAP LİSTESİ ***");
        System.out.println("SN  KİTAP NO  KİTAP ADI    FİYATI");
        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            System.out.printf("%-3d %-9d %-12S %-10.2f",
                    snNo, Kitap.kitapListesi.get(i).getKitapNo(), Kitap.kitapListesi.get(i).getKitapAdi(), Kitap.kitapListesi.get(i).getKitapFiyat());
            snNo++;
        }
    }

    private static void kitapSil() {
        boolean bulunduMu = false;
        System.out.print("Lütfen Silinecek Kitap No giriniz: ");

        int silinecekKNo = 0;
        try {
            silinecekKNo = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Kitap Nosunu rakamsal girmelisiniz ve pozitif olmalı");
            menuPanel();
        }

        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            if (Kitap.kitapListesi.get(i).getKitapNo() == silinecekKNo) {
                bulunduMu = true;
                System.out.println(Kitap.kitapListesi.remove(i));
            }
        }
        if (bulunduMu == false) System.out.println("Silinmek İçin girilen Kitap No Bulunamadı");

    }

    private static void bilgiKitapGoruntule() {
        System.out.println("\n   ***   KİTAP ARAMA MENÜSÜ   ***   ");
        System.out.println("1-Kitap Adı ile Sorgulama\n2-Kitap Yazarı ile Sorgulama\n3-Kitap Fiyatı ile Sorgulama\n4-Çıkış");
        System.out.print("Lütfen Seçiminizi Yapınız: ");

        int secim = 0;
        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Lütfen menüdeki seçim için menü başlarındaki rakamları giriniz.");
            bilgiKitapGoruntule();
        }
        switch (secim) {
            case 1:
                kitapAdiileSorgulama();
                bilgiKitapGoruntule();
                break;
            case 2:
                yazarAdiileSorgulama();
                bilgiKitapGoruntule();
                break;
            case 3:
                kitapfiyaiileSorgulama();
                bilgiKitapGoruntule();
                break;
            case 4:
                menuPanel();
            default:
                System.out.println("Hatalı Seçim Yaptınız.");
                bilgiKitapGoruntule();
                break;
        }
    }

    private static void kitapfiyaiileSorgulama() {
        boolean bulunduMu = false;
        int sNo = 0;
        System.out.print("Lütfen Kitap Fiyatını giriniz: ");
        double aranankitapFiyati = 0;
        try {
            aranankitapFiyati = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Kitap fiyatını hatalı girdiniz.");
        }
        System.out.println("SN  KİTAP NO  KİTAP ADI    FİYATI");
        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            if (Kitap.kitapListesi.get(i).getKitapFiyat() == aranankitapFiyati) {
                bulunduMu = true;
                System.out.printf("%-3d %-9d %-12S %-10.2f", sNo, Kitap.kitapListesi.get(i).getKitapNo(), Kitap.kitapListesi.get(i).getKitapAdi(), Kitap.kitapListesi.get(i).getKitapFiyat());
                sNo++;
            }
        }
        if (bulunduMu == false) System.out.println("Aranan Fiyatta Kitap Bulunamadı");
    }

    private static void yazarAdiileSorgulama() {
        int snNo = 0;
        boolean bulunduMu = false;
        System.out.print("Lütfen Yazar Adını giriniz: ");
        scan.nextLine(); // dummy scan
        String arananYazarAdi = scan.nextLine();
        System.out.println("SN  KİTAP NO  KİTAP ADI    FİYATI");
        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            if (Kitap.kitapListesi.get(i).getYazarAdi().contains(arananYazarAdi)) {
                bulunduMu = true;
                System.out.printf("%-3d %-9d %-12S %-10.2f", snNo, Kitap.kitapListesi.get(i).getKitapNo(), Kitap.kitapListesi.get(i).getKitapAdi(), Kitap.kitapListesi.get(i).getKitapFiyat());
                snNo++;
            }
        }
        if (bulunduMu == false) System.out.println("Aranan Yazar Bulunamadı");
    }

    private static void kitapAdiileSorgulama() {
        int snNo = 0;
        boolean bulunduMu = false;
        System.out.print("Lütfen Kitap Adını giriniz: ");
        scan.nextLine(); // dummy scan
        String aranankitapAdi = scan.nextLine();
        System.out.println("SN  KİTAP NO  KİTAP ADI    FİYATI");
        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            if (Kitap.kitapListesi.get(i).getKitapAdi().contains(aranankitapAdi)) {
                bulunduMu = true;
                System.out.printf("%-3d %-9d %-12S %-10.2f", snNo, Kitap.kitapListesi.get(i).getKitapNo(), Kitap.kitapListesi.get(i).getKitapAdi(), Kitap.kitapListesi.get(i).getKitapFiyat());
            }
        }
        if (bulunduMu == false) System.out.println("Aranan Kitap Bulunamadı");
    }

    private static void noKitapGoruntule() {
        kitaplistele();
        System.out.print("\nLütfen Kitap No giriniz: ");
        scan.nextLine(); // dummy scan
        int kitapNo = 0;
        try {
            kitapNo = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Lütfen Listede olan bir kitap no giriniz.");
            bilgiKitapGoruntule();
        }
        System.out.println("*** BULUNAN KİTAP BİLGİLERİ ***");
        for (int i = 0; i < Kitap.kitapListesi.size(); i++) {
            if (kitapNo == Kitap.kitapListesi.get(i).getKitapNo()) {
                System.out.println("Kitap No: " + Kitap.kitapListesi.get(i).getKitapNo() + "\nKitap Adı: " + Kitap.kitapListesi.get(i).getKitapAdi() +
                        "\nYazarı: " + Kitap.kitapListesi.get(i).getYazarAdi() + "\nFiyatı: " + Kitap.kitapListesi.get(i).getKitapFiyat());
            }
        }

    }

    private static void kitapEkle() {
        int kitapNo = 1000 + kitapSayac;
        System.out.print("Kitap Adı: ");
        scan.nextLine();//dummy
        String kitapAdi = scan.nextLine();
        System.out.print("Yazar Adı: ");
        String yazarAdi = scan.nextLine();
        System.out.print("Fiyatı: ");
        double kitapFiyat = 0;
        try {
            kitapFiyat = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Kitap Fiyatını yanlış girdiniz.");
            System.out.print("Fiyatı: ");
        }

        Kitap kitap = new Kitap(kitapNo, kitapAdi, yazarAdi, kitapFiyat);
        Kitap.kitapListesi.add(kitap);
        kitapSayac++;
        System.out.println("Kitap eklenmiştir.");
    }

    private static void cikis() {
        System.out.println("İyi okumalar... Tekrar bekleriz...");
    }
}
