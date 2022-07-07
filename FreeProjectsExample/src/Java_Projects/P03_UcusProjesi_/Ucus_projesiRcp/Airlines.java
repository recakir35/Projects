package Java_Projects.P03_UcusProjesi_.Ucus_projesiRcp;

import java.util.Scanner;

public class Airlines {
    public void seyahat() { // Menü Şehir Girişi
        Scanner scan = new Scanner(System.in);
        System.out.println("***** AİRLİNES HAVA YOLLARI *****");
        String secilenSehir;
        double biletTutari = 0;
        boolean kontrol = false;
        int yas = 0;
        char gidisDonus='H';

        do {
            System.out.print("B, C , D Şehirlerinden hangisine Bilet almak istiyorsunuz: "); // *** Gitmek İstediğiniz Yer Kontrolü
            secilenSehir = scan.nextLine().toUpperCase();
            if (secilenSehir.equalsIgnoreCase("B") || secilenSehir.equalsIgnoreCase("C") || secilenSehir.equalsIgnoreCase("D")) {
                kontrol = true;
            } else {
                System.out.println("Hatalı Şehir Girişi yaptınız.");
                kontrol = false;
            }

            System.out.print("Lütfen Yaşınızı Giriniz: ");  // Yaş Kontrolü
            yas = scan.nextInt();
            if (yas > 0 && yas < 130) {
                kontrol = true;
            } else {
                System.out.println("Hatalı Yaş Girişi yaptınız");
                kontrol = false;
            }

            System.out.print("Bilet Gidis-Dönüşmü almak istersiniz(E/H): "); //Gidiş Dönüş Kontrolü
            gidisDonus = scan.next().toUpperCase().charAt(0);
            if (gidisDonus == 'E' || gidisDonus == 'H') {
                kontrol = true;
            } else {
                System.out.println("Hatalı Giriş Yaptınız.");
                kontrol = false;
            }

        } while (kontrol != true);

        if (gidisDonus=='E'){
            biletTutari = (2*(TicketCount.biletHesaplama(secilenSehir) - TicketCount.yasIndirim(yas)))*0.80;
        }else biletTutari = TicketCount.biletHesaplama(secilenSehir) - TicketCount.yasIndirim(yas);

        System.out.println("\n"+secilenSehir + " Şehrine Ödemeniz Gereken Tutar:" + biletTutari+ " $");
    }
}
