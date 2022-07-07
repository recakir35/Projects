package Java_Projects.P08_HastaneOtomasyon_;

import java.util.Arrays;
import java.util.Scanner;

public class HastaneRunner {
    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {
        System.out.println("   ***   YILDIZ HASTANESİ   ***   ");
        System.out.println("\nHastalık Çeşitleri: " + Arrays.toString(hastane.durumlar));
        Scanner scan = new Scanner(System.in);
        System.out.print("\nLütfen Hastalığını giriniz: ");
        String hastaDurumu = scan.nextLine();
        String unvan = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));
        System.out.println("   ***   DOKTOR   ***   ");
        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

        hastane.setHasta(hastaBul(hastaDurumu));
        System.out.println("\n   ***   HASTA   ***   ");
        System.out.println("Hasta ismi: " + hastane.getHasta().getIsim());
        System.out.println("Hasta soy isim: " + hastane.getHasta().getSoyIsim());
        System.out.println("Hasta ID: " + hastane.getHasta().getHastaID());
    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane.unvanlar[0];
        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane.unvanlar[2];
        } else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return hastane.unvanlar[3];
        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane.unvanlar[4];
        } else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "yanlis durum";
    }


    private static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equalsIgnoreCase(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }
        }
        return doktor;
    }


    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurum = new Durum();
        switch (aktuelDurum) {
            case "Allerji":
                hastaDurum.setAciliyet(false);
                break;
            case "Bas agrisi":
                hastaDurum.setAciliyet(false);
                break;
            case "Diabet":
                hastaDurum.setAciliyet(false);
                break;
            case "Soguk alginligi":
                hastaDurum.setAciliyet(false);
                break;
            case "Migren":
                hastaDurum.setAciliyet(true);
                break;
            case "Kalp hastaliklari":
                hastaDurum.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
                break;
        }
        return hastaDurum;
    }

        public static Hasta hastaBul (String aktuelDurum){
            Hasta hasta = new Hasta();
            for (int i = 0; i < hastane.hastaIsimleri.length; i++) {

                if (aktuelDurum.equalsIgnoreCase(hastane.durumlar[i])) {
                    hasta.setIsim(hastane.hastaIsimleri[i]);
                    hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                    hasta.setHastaID(hastane.hastaIDleri[i]);
                }
            }
            return hasta;
        }
    }

