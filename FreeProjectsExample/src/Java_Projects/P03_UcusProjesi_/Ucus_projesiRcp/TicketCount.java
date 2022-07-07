package Java_Projects.P03_UcusProjesi_.Ucus_projesiRcp;

public class TicketCount {
    static String gidilecekSehir;
    static int yas;
    static char secim;
    static double fiyat;
    static double indirim;

    static double biletHesaplama(String gidilecekSehir) { // bilet hesaplama
        if (gidilecekSehir.equalsIgnoreCase("B")) {
            fiyat = 500 * 0.10;
        } else if (gidilecekSehir.equalsIgnoreCase("C")) {
            fiyat = 700 * 0.10;
        } else if (gidilecekSehir.equalsIgnoreCase("D")) {
            fiyat = 900 * 0.10;
        }
        return fiyat;
    }

    static double yasIndirim(int yas) {
        if (yas < 12) {
//            System.out.println("12 Yaş Altı olduğunuzdan %50 indirim uygulanacaktır");
            indirim = fiyat * 0.50;
        } else if (yas >= 12 && yas < 24) {
            indirim = fiyat * 0.10;
        } else if (yas >= 24 && yas < 65) {
            indirim = fiyat * 0;
        } else if (yas >= 65) {
            indirim = fiyat * 0.20;
        }
        return indirim;
    }

}
