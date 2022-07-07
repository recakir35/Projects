package Java_Projects.P07_GeometrikHesaplama_;

import java.util.Scanner;

public class Runner {
    static double alan = 0;
    static double cevre = 0;

    public static void main(String[] args) {
        System.out.println("   ***   ALAN VEYA ÇEVRE HESAPLAMA   ***   ");

        anaMenu();

    }

    private static void anaMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n1-Kare\n2-Dikdörtgen\n3-Çember\n4-Çıkış");
        System.out.print("Lütfen Seçiminizi yapınız: ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                Kare.kareHesaplama();
                anaMenu();
                break;
            case 2:
                Dikdortgen.dikdortgenHesaplama();
                anaMenu();
                break;
            case 3:
                Cember.cemberHesaplama();
                anaMenu();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                anaMenu();
                break;
        }
    }

    private static void cikis() {
        System.out.println("Yine bekleriz...");
    }
}
