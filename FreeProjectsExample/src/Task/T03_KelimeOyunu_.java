package Task;


import java.util.Scanner;


public class T03_KelimeOyunu_ {
    static int oyuncu=1;
    static int puan1;
    static int puan2;
    static String kelime;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */
        kelimeGir();

    }

    private static void kelimeGir() {
        System.out.print("Kelime giriniz: ");
        kelime = scan.next();
        System.out.println(oyuncu + ".Oyuncunun girdiği kelime: " + kelime);
        oyuncuDegistir();
    }

    private static void oyuncuDegistir() {
        if (oyuncu == 1) {
            oyuncu = 2;
        } else if (oyuncu == 2) {
            oyuncu = 1;
        }
        kelimeKabulMu();
    }

    private static void kelimeKabulMu() {
        System.out.print("Sayın " + oyuncu + ".Oyuncu Kelimeyi Kabul ediyormusun(E/H):");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("E")) {
            if (oyuncu == 1) {
                puan2 += kelime.length();
            } else if (oyuncu == 2) {
                puan1 += kelime.length();
            }
            kelimeEkle();
        } else if (secim.equalsIgnoreCase("H")) {
            System.out.println("Geçersiz gelime");
            if (oyuncu == 1) {
                System.out.println("Oyunu 2.Oyuncu Kazandı");
            } else if (oyuncu == 2) {
                System.out.println("Oyunu 1.Oyuncu Kazandı");
            }
            oyundanCikis();
        }

    }

    private static void kelimeEkle() {
        System.out.print("Ekleyeceğiniz Kelimeyi Başa Eklemek İçin:Bas, Sona eklemek İçin:Son yazınız: ");
        String secim = scan.next();
        System.out.print("Ekleyeceğiniz kelimeyi yazınız: ");
        String eklenenKelime = scan.next();
        if (secim.equalsIgnoreCase("Bas")) {
            kelime = eklenenKelime + kelime;
            System.out.println(kelime);
        } else if (secim.equalsIgnoreCase("Son")) {
            kelime = kelime + eklenenKelime;
            System.out.println(kelime);
        }
        oyuncuDegistir();
    }

    private static void oyundanCikis() {
        System.out.println("1.Oyuncu Puan: " + puan1 + " , 2.Oyuncu Puan: " + puan2);
    }
}
