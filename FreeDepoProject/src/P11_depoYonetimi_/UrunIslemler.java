package P11_depoYonetimi_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UrunIslemler implements AnaDepo {
    TrayCatch tray = new TrayCatch();
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

    public void feykUrunEkle(){
        urunListesi.put(1001,new Urun(1001, "Domates","Ali Usta",10,"Kasa",0));
        urunListesi.put(1002,new Urun(1002, "Biber","Ali Usta",7,"Kasa",0));
        urunListesi.put(1003,new Urun(1003, "Patlıcan","Ali Usta",15,"Kasa",0));
        urunListesi.put(1004,new Urun(1004, "Taze Fasülye","Ali Usta",20,"Çuval",0));
        urunListesi.put(1005,new Urun(1005, "Salatalık","Ali Usta",25,"Çuval",0));
    }

    public void urunTanımlama() { // Ürün Tanımlama Methodu
        System.out.println("\n   ***  ÜRÜN TANIMLAMA   ***   ");

        scan.nextLine();//dumy
        System.out.print(B + "Ürün İsmini: ");
        String urunIsmi = scan.nextLine();

        System.out.print("Üretici: ");
        String uretici = scan.nextLine();

        System.out.print("Ürün Birim(Adet,Kg,Çuval, Kasa vs.): ");
        String urunbirim = scan.nextLine();

        System.out.print("Ürün Adedi: ");
        int urunAdet = tray.trayCatch();

        int rafNo = 0;
        Urun urun = new Urun(idUrun, urunIsmi, uretici, urunAdet, urunbirim, rafNo); // alınan değerler constructor aracılığıyla objeye aktariliyor.
        urunListesi.put(idUrun, urun);                       // obje Map'e aktarılıyor.
        idUrun++;
        System.out.println(R + "Ürün Girişi Yapılmıştır" + B);
    }


    public void urunListele() {

        //  Set<Map.Entry<Integer,Urun>> urunListele= urunListesi.entrySet();// urunlerListesi Listelemede kullanabilmek için EntrySet'e atılıyor

        System.out.println("   ***   ÜRÜN LİSTESİ   ***   ");
        System.out.println("İD     ÜRÜN İSMİ   ÜRETİCİ   BİRİM   MİKTAR   RAF");
        System.out.println("____   _________   _______   _____   ______   ___");

        for (Map.Entry<Integer, Urun> each : urunListesi.entrySet()) {// Map'in Entri Clasından faydalanıyoruz
            System.out.printf(G + "%-6d %-11.11s %-9.8s %-8.7s %-7d %-8d", each.getValue().getId(), each.getValue().getUrunIsmi(), each.getValue().getUretici(), each.getValue().getBirim(), each.getValue().getMiktar(), each.getValue().getRaf());
            System.out.println(B);
        }
    }

    public void urunuRafaKoy() {
        System.out.println("   ***   ÜRÜN RAF DÜZENİ   ***   ");

        System.out.print(B + "\nRafa Koymak istediğiniz Ürünün İd sini yazınız: ");
        int urunRaf = tray.trayCatch();

        if (urunListesi.keySet().contains(urunRaf)) {
            urunListesi.get(urunRaf).setRaf((int) (Math.random() * 20));
            System.out.println(R + "\n* " + urunListesi.get(urunRaf).getUrunIsmi() + " Ürünü " + urunListesi.get(urunRaf).getRaf() + ". Raf'a yerleştirildi." + B);
        } else System.out.println(R + "Girilen id'ye sahip ürün bulunamadı" + B);

    }

    private void urunCikisi() {
        System.out.println(R + "   ***   ÜRÜN ÇIKIŞI   ***   " + B);

        System.out.print("\nÇıkış yapmak istediğiniz Ürün İd: ");
        int urunCikis = tray.trayCatch();

        System.out.print("Çıkış yapmak istediğiniz Ürün Adedi: ");
        int urunAdet = scan.nextInt();

        if (urunListesi.keySet().contains(urunCikis)) {
            System.out.println("Ürün Adı: " + urunListesi.get(urunCikis).getUrunIsmi());
            System.out.println("Üretici: " + urunListesi.get(urunCikis).getUretici());
            urunListesi.get(urunCikis).setMiktar(urunListesi.get(urunCikis).getMiktar() - urunAdet);
            System.out.println("\n* " + urunListesi.get(urunCikis).getUrunIsmi() + R + " Ürün Çıkışı yapılmıştır." + B);
        }
    }

    public void anaMenu() {
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

    private void urunGirisi() {
        System.out.println("   ***   URUN GİRİŞİ   ***   ");

        System.out.print(B + "Lütfen Giriş yapılacak Ürün id giriniz: ");
        int arananId = tray.trayCatch();

        if (urunListesi.keySet().contains(arananId)) { // urunListesinde arananId varsa
            System.out.println("Ürün Adı: " + urunListesi.get(arananId).getUrunIsmi());
            System.out.println("Üretici: " + urunListesi.get(arananId).getUretici());
            System.out.print(B + "Giriş Yapılacak miktarı giriniz : ");
            int girisMiktar = tray.trayCatch();

            urunListesi.get(arananId).setMiktar(girisMiktar + urunListesi.get(arananId).getMiktar());//Mevcut Miktar ile Girilen Miktarı topluyor.

            System.out.println(R + "Ürün Eklemesi Yapılmıştır " + B);
        } else System.out.println(R + "Girilen id nolu ürün yok" + B);
    }

    private static void cikis() {
        System.out.println("Yine bekleriz...");
    }
}
