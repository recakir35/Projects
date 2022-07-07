package Java_Projects.P10_aracKiralama;

import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("   ***   ÇAKIR RENTECAR   ***   ");
        AracKiralamaIslemleri.aracKiralama();
        //anaMenu();
    }

    private static void anaMenu() {
        System.out.println("   ***   MÜŞTERİ KAYIT EKRANI   ***   ");

        System.out.println("1-Araç Kiralama\n2-Araç Bilgisi Girme\n3-Çıkış");
        System.out.println("Seçiminizi yapınız: ");
        char secim = scan.next().charAt(0);
        switch (secim) {
            case '1':
                AracKiralamaIslemleri.aracKiralama();
                anaMenu();
                break;
            case '2':
                AracKiralamaIslemleri.aracBilgiGirme();
                anaMenu();
                break;
            case '3':
                AracKiralamaIslemleri.Cikis();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                anaMenu();
                break;
        }
    }


}
