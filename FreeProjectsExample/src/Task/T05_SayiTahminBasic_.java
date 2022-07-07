package Task;

import java.util.Random;
import java.util.Scanner;

public class T05_SayiTahminBasic_ {
    /*
     Sayı tahmin etme oyunu....
     Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
     tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
     */
    public static void main(String[] args) {
        System.out.println("        *** SAYI TAHMİN OYUNU ***     ");
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();// Bilgisayardan Bir Sayı Alınıyor
        int rastSayi = rnd.nextInt(101);
        System.out.print("0 - 100 arasında bir sayı giriniz: ");
        int tahmin=scan.nextInt();
        int sayac=0;

        while (rastSayi!=tahmin){
            if (tahmin<rastSayi){
                System.out.print("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt();
            }else {
                System.out.print("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();
            }
            sayac++;
        }
        if (sayac <= 2) {
            System.out.println("\nAltın Bronz aldınız..." + sayac + " Tahminde sayıyı buldunuz. Sayı:" + rastSayi);
        } else if (sayac > 2 && sayac <= 4) {
            System.out.println("\nGümüş Bronz aldınız..." + sayac + " Tahminde sayıyı buldunuz. Sayı:" + rastSayi);
        }
        if (sayac > 4) {
            System.out.println("\nTENEKE Bronz.... okadarda zor değildi." + sayac + " Tahminde sayıyı buldunuz. Sayı:" + rastSayi);
        }
    }
}


