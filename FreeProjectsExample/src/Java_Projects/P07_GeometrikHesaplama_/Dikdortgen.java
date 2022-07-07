package Java_Projects.P07_GeometrikHesaplama_;

import java.util.Scanner;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    public static void dikdortgenHesaplama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin Uzun Kenarını giriniz: ");
        double uzunKenar = scan.nextInt();
        System.out.print("Dikdörtgenin Kısa Kenarını giriniz: ");
        double kisaKenar = scan.nextInt();
        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
        Runner.alan=dikdortgen.alanHesaplama(uzunKenar, kisaKenar);
        Runner.cevre=dikdortgen.cevreHesaplama(uzunKenar, kisaKenar);
        System.out.println(dikdortgen);
    }

    @Override
    public String toString() {
        return " Dikdörtgenin Alanı: "+Runner.alan+
                " Dikdörtgenin Çevresi: "+Runner.cevre;
    }
}
