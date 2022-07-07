package Task;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili_ {
    static Scanner scan = new Scanner(System.in);
    static Random rnd = new Random();// Bilgisayardan Bir Sayı Alınıyor
   static int kredi = 100;
   static int oyunSayisi = 1;
   static int oyunHakki = 1;

    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
           *  Eger kullanici ilk
         * tahmininde bilirse x4 Kredi kazansin, ikici tahmininde bilirse x3, ucuncu
         * tahmininde bilirse x2 4 ve sonrasinda herhangi bir bonus kazanmasin kazanirsa
         * yeni bir oyuna baslamak istiyor mu diye sor. Baslarsa oyunu zorlastir. Kredi
         * seviyesi kritik duzeye indiginde yeni bir oyun hakki tani (30)
         */
        System.out.println("        *** SÜPER SAYI TAHMİN OYUNU ***     ");
        int rastSayi = rnd.nextInt(101);
        System.out.print("0 - 100 arasında bir sayı giriniz: ");
        int tahmin = scan.nextInt();
        int tahminSayisi = 0;

        while (rastSayi != tahmin) {
            if (tahmin < rastSayi) {
                System.out.print("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt();
                kredi -= 10;
            } else {
                System.out.print("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();
                kredi -= 10;
            }
            tahminSayisi++;
        }
        if (tahminSayisi <= 1) {
            kredi *= 4;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 400 Puan kazandınız. Toplam Krediniz:" + kredi);
        } else if (tahminSayisi <= 2) {
            kredi *= 3;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 300 kazandınız. Toplam Krediniz:" + kredi);
        } else if (tahminSayisi <= 3) {
            kredi *= 2;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 200 kazandınız. Toplam Krediniz:" + kredi);
        }
        System.out.println(kredi+" Puanınız kaldı. Mevcut Puanlarınızla yeni oyun oynamak istermisiniz(E/H)");
        String yeniOyun = scan.next().toUpperCase();

        if (yeniOyun.equals("E")) {
            yeniOyunOyna();
        } else System.out.println("Güle güle yine bekleriz.");
    }

    private static void yeniOyunOyna() {
        int tahminSayisi = 0;
        int rastSayi = rnd.nextInt(301);
        System.out.print("0 - 300 arasında bir sayı giriniz: ");
        int tahmin = scan.nextInt();

        do {
            if (tahmin < rastSayi) {
                System.out.print("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt();
                kredi -= 10;
            } else {
                System.out.print("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();
                kredi -= 10;
            }
            tahminSayisi++;

        } while (rastSayi != tahmin);
        if (tahminSayisi <= 1) {
            kredi *= 4;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 400 Puan kazandınız. Toplam Krediniz:" + kredi);
        } else if (tahminSayisi <= 2) {
            kredi *= 3;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 300 kazandınız. Toplam Krediniz:" + kredi);
        } else if (tahminSayisi <= 3) {
            kredi *= 2;
            System.out.println(tahminSayisi + " Tahminde sayıyı bulduğunuz için 200 kazandınız. Toplam Krediniz:" + kredi);
        }
        System.out.println("Mevcut Puanlarınızla yeni oyun oynamak istermisiniz(E/H)");
        String yeniOyun = scan.next().toUpperCase();

        if (yeniOyun.equals("E")) {
            yeniOyunOyna();
        } else System.out.println("Güle güle yine bekleriz.");
    }
}
