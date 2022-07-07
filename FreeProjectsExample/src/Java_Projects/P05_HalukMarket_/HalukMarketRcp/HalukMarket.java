package Java_Projects.P05_HalukMarket_.HalukMarketRcp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HalukMarket {
    static Scanner scan = new Scanner(System.in);
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"));
    static List<Double> fiyatListesi = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

    static List<String> sepetUrunler = new ArrayList<String>();
    static List<Double> sepetUrunFiyat = new ArrayList<Double>();
    static List<Integer> sepetUrunKg = new ArrayList<Integer>();
    static double toplamOdeme = 0;
    static double odenen=0;

    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
        urunMenu();
    }

    private static void urunMenu() {
        System.out.println("SN   URUN      FİYAT(TL)");
        System.out.println("__   ____      _________");
        for (int i = 0; i < urunListesi.size(); i++) { // Ürün Fiyat Listesini Yazdırıyor.
            System.out.printf("%-3d %-12s %-5.2f TL", (i + 1), urunListesi.get(i), fiyatListesi.get(i));
            System.out.println();
        }
        urunSecim();
    }

    private static void urunSecim() {
        boolean kontrol = false;

        do {
            System.out.print("Lütfen almak istediğiniz bir ürün seçiniz: ");
            int urunSecimi = scan.nextInt()-1;
            System.out.print("Kaç kilo almak istersin: ");
            int istenenKg = scan.nextInt();

            sepetUrunler.add(urunListesi.get(urunSecimi));
            sepetUrunFiyat.add(fiyatListesi.get(urunSecimi));
            sepetUrunKg.add(istenenKg);

            sepetYazdir();

            System.out.print("Başka ürün almak istermisiniz(E/H): ");
            String secim = scan.next();
            if (secim.equalsIgnoreCase("E")) {
                kontrol = true;
            } else if (secim.equalsIgnoreCase("H")) {
                kontrol = false;
            }
        } while (kontrol == true);
        System.out.println("ÖDENECEK TOPLAM FİYAT: "+toplamOdeme);
        System.out.print("Lütfen Nakit giriniz: ");
        odenen=scan.nextDouble();
        System.out.println("PARA ÜSTÜ: "+(odenen-toplamOdeme));
        System.out.print("Fiş İstermisiniz(E/H): ");
        String secim=scan.next();
        if (secim.equalsIgnoreCase("E")) {
            fisyazdir();
        }else  System.out.println("Fiş istemediniz. Yine bekleriz.");
    }

    private static void fisyazdir() {
        LocalDateTime mrk= LocalDateTime.now();
        System.out.println("\n             ***** ÇAKIRLAR MARKET *****     ");
        System.out.println("Adres: Sanayi Mh.Sanayi Cd.Sanayi Sk.Sanayi Apt.No:15");
        System.out.println("            Merkez/Kastamonu Tel:03662141515");
        System.out.println("Tarih: "+mrk.getDayOfMonth()+"."+mrk.getMonth()+"."+mrk.getYear()+"                      Saat:"+ mrk.getHour()+":"+mrk.getMinute());
        System.out.println();
        sepetYazdir();

        System.out.println("TOPLAM TUTAR: "+toplamOdeme+" TL \nÖDENEN TUTAR: "+odenen+ " TL \nPARA ÜSTÜ: "+(odenen-toplamOdeme)+" TL");
        System.out.println("\nYine bekleriz...");

    }

    private static void sepetYazdir() {
        int toplamKg = 0;

        System.out.println("SN   URUN     B.FİYAT(TL)  KG        TUTAR(TL)");
        System.out.println("__   ____     __________   __        _______");
        for (int i = 0; i < sepetUrunler.size(); i++) {
            System.out.printf("%-4d %-10s %-10.2f %-8d  %-11.2f", (i + 1), sepetUrunler.get(i), sepetUrunFiyat.get(i), sepetUrunKg.get(i), (sepetUrunFiyat.get(i) * sepetUrunKg.get(i)));
            toplamOdeme += (sepetUrunFiyat.get(i) * sepetUrunKg.get(i));
            toplamKg += (sepetUrunKg.get(i));
            System.out.println();
        }
        System.out.println("==========================================");
        System.out.printf("Toplam :                   %-8d  %-10.2f", toplamKg, toplamOdeme);
        System.out.println();

    }

}
