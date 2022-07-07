package Java_Projects.P06_KahveMakinesi_.Kahve_makinesi01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kahve {
    static Scanner scan = new Scanner(System.in);
    static String kahveSecim;
    static List<String> kahveCesit = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Filtre Kahve", "Esprresso"));
    static List<String> bardakCesit = new ArrayList<>(Arrays.asList("Küçük Boy", "Orta Boy", "Büyük Boy", "Duble Boy"));
    static List<String> sekerCesit = new ArrayList<>(Arrays.asList("Az Şekerli", "Orta Şekerli", "Şekerli"));
    static List<String> sutCesit = new ArrayList<>(Arrays.asList("Az Sütlü", "Orta Sütlü", "Bol Sütlü"));

    static void kahveMenu() {
        for (int i = 0; i < kahveCesit.size(); i++) {
            System.out.println((i + 1) + ". " + kahveCesit.get(i));
        }
        System.out.print("Lütfen bir kahve seçiniz: ");
        int secim = scan.nextInt()-1;
        kahveSecim = kahveCesit.get(secim);
        kahveHazirlama();
    }

    private static void kahveHazirlama() {
        String seker="";
        String sut="";
        System.out.println();
        for (int i = 0; i <bardakCesit.size() ; i++) {
            System.out.print((i+1)+"- "+bardakCesit.get(i)+" ");
        }
        System.out.print("\nHangi boy bardak kullanmak istersiniz: ");
        int bardakSecim = scan.nextInt()-1;
        String bardak=bardakCesit.get(bardakSecim);

        System.out.print("\nŞeker istermisiniz(E/H): ");
        String secim1 = scan.next();scan.nextLine();
        System.out.println();
        if (secim1.equalsIgnoreCase("E")) {
            for (int i = 0; i <sekerCesit.size() ; i++) {
                System.out.print((i+1)+"- "+sekerCesit.get(i)+" ");
            }
            System.out.print("\nŞeker Miktarını seçiniz: ");
            int sekerSecim = scan.nextInt()-1;
            seker=sekerCesit.get(sekerSecim);
        }else seker="Şekersiz";


        System.out.print("\nKahvenize Süt istermisiniz(E/H): ");
        String secim2 = scan.next();scan.nextLine();
        System.out.println();
        if (secim2.equalsIgnoreCase("E")) {
            for (int i = 0; i <sutCesit.size() ; i++) {
                System.out.print((i+1)+"- "+sutCesit.get(i)+" ");
            }
            System.out.print("\nSüt Miktarını seçiniz: ");
            int sutSecim = scan.nextInt()-1;
            sut=sutCesit.get(sutSecim);
        }else  sut="Sütsüz";

        System.out.println("\nSeçiminiz: "+kahveSecim+" - "+ bardak+" - "+seker+" - "+sut);
        System.out.print("\n"+kahveSecim+" Hazırlanıyor");
        saniyeCalis();
        if (secim1.equalsIgnoreCase("E")){
            System.out.print("\nŞeker İlave ediliyor");
            saniyeCalis();
        }
        if (secim2.equalsIgnoreCase("E")){
            System.out.print("\nSüt İlave ediliyor");
            saniyeCalis();
        }

        System.out.println("\n\nKahveniz Hazırdır. Afiyet Olsun.");
    }

    private static void saniyeCalis() {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
