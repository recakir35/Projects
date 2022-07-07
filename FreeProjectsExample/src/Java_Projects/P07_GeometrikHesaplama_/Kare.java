package Java_Projects.P07_GeometrikHesaplama_;

import java.util.Scanner;


public class Kare extends Sekil {



    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    public static void kareHesaplama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Karenin Kenar uzunluğunu giriniz: ");
        int kenar = scan.nextInt();
        Kare kare = new Kare(kenar, kenar);
        Runner.alan=kare.alanHesaplama(kenar, kenar);
        Runner.cevre=kare.cevreHesaplama(kenar,kenar);
        System.out.println(kare);
    }

    @Override
    public String toString() {
        return " Karenin Alanı: "+Runner.alan+
        " Karenin Çevresi: "+Runner.cevre;
    }
}
