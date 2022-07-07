package Middle_Projects.M01_SansliKullanici_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel() {
        Scanner scan = new Scanner(System.in);
        Kayit yeniKayit = new Kayit();

        List<Kullanici> kisi = new ArrayList<>();
        boolean cikilsinMi = false;


        while (!cikilsinMi) {
            System.out.println("\n1:Kayıt al\n2:Şanslı Kişi Bul\n3:Kişiler Listesi\n4:Çıkış");
            System.out.print("Lütfen İşleminizi Seçiniz: ");
            int islem = scan.nextInt();
            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatalı veri girdiniz.");


            }
        }
    }
}
