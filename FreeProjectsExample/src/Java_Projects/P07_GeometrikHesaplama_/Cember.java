package Java_Projects.P07_GeometrikHesaplama_;

import java.util.Scanner;

public class Cember extends Sekil{
    public Cember(double yaricap) {
        super(yaricap);
    }

    public static void cemberHesaplama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Çemberin Yarı Çapını giriniz: ");
        double yariCap = scan.nextDouble();
        Cember cember = new Cember(yariCap);
        Runner.alan=cember.cemberAlanHesaplama(yariCap);
        Runner.cevre=cember.yaricapCevreHesaplama(yariCap);
        System.out.println(cember);
    }

    @Override
    public String toString() {
        return " Çemberin Alanı: "+Runner.alan+
                " Çemberin Çevresi: "+Runner.cevre;
    }
}
