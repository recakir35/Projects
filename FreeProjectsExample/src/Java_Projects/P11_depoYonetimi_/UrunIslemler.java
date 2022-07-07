package Java_Projects.P11_depoYonetimi_;

import java.util.*;

public class UrunIslemler {
    // Rengi atadığımız harfi W+,R+, vb. rengini değiştireceğimiz olgunun başına yazmamız yeterli
    // o satırdan sonrası o renk ile boyanır.
    public static final String W = "\u001B[37m"; // Gri Rengi Tanımlıyor
    public static final String R = "\u001B[31m"; // Kırmızı Rengi Tanımlıyor
    public static final String G = "\u001B[32m"; // Yeşil Rengi Tanımlıyor
    public static final String Y = "\u001B[33m"; // Sarı Rengi Tanımlıyor
    public static final String B = "\u001B[34m"; // Mavi Rengi Tanımlıyor
    static Scanner scan = new Scanner(System.in);
    static int idUrun = 1000;
    static HashMap<Integer, Urun> urunListesi = new HashMap<>();

    public static void urunTanımlama() { // Ürün Tanımlama Methodu
        System.out.println("\n   ***  ÜRÜN TANIMLAMA   ***   ");

        while (true) {
            scan.nextLine();//dumy
            System.out.print(B + "Ürün İsmini: ");
            String urunIsmi = scan.nextLine();

            System.out.print("Üretici: ");
            String uretici = scan.nextLine();

            System.out.print("Ürün Birim(Adet,Kg,Çuval, Kasa vs.): ");
            String urunbirim = scan.nextLine();

            System.out.print("Ürün Adedi: ");
            int urunAdet = 0;
            try {
                urunAdet = scan.nextInt();
                if (urunAdet < 0) throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println(R + "Ürün Adedi sıfırdan küçük olamaz" + B);
                break;
            } catch (Exception e) {
                System.out.println(R + "Ürün Adedi rakam olmalıdır" + B);
                break;
            }

            int rafNo = 0;
            Urun urun = new Urun(idUrun, urunIsmi, uretici, urunAdet, urunbirim, rafNo); // alınan değerler constructor aracılığıyla objeye aktariliyor.
            urunListesi.put(idUrun, urun);                       // obje Map'e aktarılıyor.
            idUrun++;
            System.out.println(R + "Ürün Girişi Yapılmıştır" + B);
            break;
        }
    }


    private static void urunListele() {

        //  Set<Map.Entry<Integer,Urun>> urunListele= urunListesi.entrySet();// urunlerListesi Listelemede kullanabilmek için EntrySet'e atılıyor

        System.out.println("   ***   ÜRÜN LİSTESİ   ***   ");
        System.out.println("İD     ÜRÜN İSMİ   ÜRETİCİ   BİRİM   MİKTAR   RAF");
        System.out.println("____   _________   _______   _____   ______   ___");
        int j = 1000;
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.printf(G + "%-6d %-11.11s %-9.8s %-8.7s %-7d %-8d", urunListesi.get(j).getId(), urunListesi.get(j).getUrunIsmi(), urunListesi.get(j).getUretici(), urunListesi.get(j).getBirim(), urunListesi.get(j).getMiktar(), urunListesi.get(j).getRaf());
            System.out.println(B);
            j++;
        }

    }

    private static void urunuRafaKoy() {
        System.out.println("   ***   ÜRÜN RAF DÜZENİ   ***   ");
        while (true) {
            System.out.print(B + "\nRafa Koymak istediğiniz Ürünün İd sini yazınız: ");
            int urunRaf = 0;
            try {
                urunRaf = scan.nextInt();
                if (urunRaf < 1000) throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println(R + "Ürün İd 1000'den küçük olamaz" + B);
                break;
            } catch (Exception e) {
                System.out.println(R + "Ürün İd Rakamsal olmalı" + B);
                break;
            }

            if (urunListesi.keySet().contains(urunRaf)) {
                urunListesi.get(urunRaf).setRaf((int) (Math.random() * 20));
                System.out.println(R + "\n* " + urunListesi.get(urunRaf).getUrunIsmi() + " Ürünü " + urunListesi.get(urunRaf).getRaf() + ". Raf'a yerleştirildi." + B);
            } else System.out.println(R + "Girilen id'ye sahip ürün bulunamadı" + B);

            break;
        }
    }

    private static void urunCikisi() {
        System.out.println(R + "   ***   ÜRÜN ÇIKIŞI   ***   " + B);

        System.out.print("\nÇıkış yapmak istediğiniz Ürün İd: ");
        int urunCikis = 0;
        try {
            urunCikis = scan.nextInt();
            if (urunCikis<1000) throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Ürün id 1000'den küçük olamaz");
        }
        catch (Exception e) {
            System.out.println("Ürün İd Rakamsal olmalıdır");
        }
        System.out.print("Çıkış yapmak istediğiniz Ürün Adedi: ");
        int urunAdet = scan.nextInt();

        if (urunListesi.keySet().contains(urunCikis)) {
            urunListesi.get(urunCikis).setMiktar(urunListesi.get(urunCikis).getMiktar()-urunAdet);
            System.out.println("\n* "+urunListesi.get(urunCikis).getUrunIsmi()+" Ürün Çıkışı yapılmıştır.");
        }
    }

    public static void anaMenu() {
        System.out.println(B + "====================== İŞLEMLER ====================\r\n"
                + "   | 1-URUN TANIMLAMA |        |  2-URUN LİSTELE  |   \n"
                + "   | 3-URUN GIRISI    |        |  4-URUN RAFA KOY |   \n"
                + "   | 5-URUN CIKISI    |        |  6-CIKIS         |   \n" + R);

        System.out.print("Lütfen menü seçiminizi yapınız: ");
        char secim = scan.next().charAt(0);
        switch (secim) {
            case '1':
                urunTanımlama();
                anaMenu();
                break;
            case '2':
                urunListele();
                anaMenu();
                break;
            case '3':
                urunGirisi();
                anaMenu();
                break;
            case '4':
                urunuRafaKoy();
                anaMenu();
                break;
            case '5':
                urunCikisi();
                anaMenu();
                break;
            case '6':
                cikis();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");
                anaMenu();

        }
    }

    private static void urunGirisi() {
        System.out.println("   ***   URUN GİRİŞİ   ***   ");

        while (true) {
            System.out.print(B + "Lütfen Giriş yapılacak Ürün id giriniz: ");
            int arananId = 0;
            try {
                arananId = scan.nextInt();
                if (arananId < 1000) throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Ürün id 1000'den büyük olmalıdır");
                break;
            } catch (Exception e) {
                System.out.println(R + "Ürün id Rakamlardan oluşmalıdır" + B);
                break;
            }

            if (urunListesi.keySet().contains(arananId)) { // urunListesinde arananId varsa
                System.out.print(B + "Giriş Yapılacak miktarı giriniz : ");
                int girisMiktar = 0;
                try {
                    girisMiktar = scan.nextInt();
                    if (girisMiktar < 0) throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.out.println(R + "Miktar sıfırdan büyük olmalı" + B);
                    break;
                } catch (Exception e) {
                    System.out.println(R + "Miktar rakamsal olmalı" + B);
                    break;
                }

                urunListesi.get(arananId).setMiktar(girisMiktar + urunListesi.get(arananId).getMiktar());//Mevcut Miktar ile Girilen Miktarı topluyor.

                System.out.println(R + "Ürün Eklemesi Yapılmıştır " + B);
            } else System.out.println(R + "Girilen id nolu ürün yok" + B);
            break;
        }

    }

    private static void cikis() {
        System.out.println("Yine bekleriz...");
    }
}
