package Small_Projects;

import java.util.Scanner;

public class
TopunZiplayarakYolAlması_ {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Topun atıldığı yüksekliği giriniz: ");
        double yukseklik=scan.nextDouble();
        int ziplamaSayisi=0;
        double toplamYol=0;

        do {
            toplamYol+=yukseklik;   // Atıldığı yükseklikten yere inmesi
            yukseklik*=0.75;        // hız azalması
            toplamYol+=yukseklik;   // yere çarpıp azalan hızla tekrar yükselmesi
            ziplamaSayisi++;        // yere vurma sayısı
        } while (yukseklik>1);      // Yükseklik birin altına düşünce döngüden çıkar

        System.out.println("Topun Zıplama Sayisi: "+ziplamaSayisi);
        System.out.println("Topun Aldığı Yol: "+toplamYol);

    }
}
