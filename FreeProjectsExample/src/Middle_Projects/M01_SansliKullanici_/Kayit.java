package Middle_Projects.M01_SansliKullanici_;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    List<Kullanici> kisiler = new ArrayList<>(); //

    public List<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nAdınızı giriniz: ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);
        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll){
        for (Kullanici each:kll){
            if (each.kayitZamani.getSecond()<10){
                System.out.println("\n"+each.name+" Şanslı kişisiniz.");
            }else System.out.println("\nMaalesef "+ each.name+" Şanslı kişi Değilsiniz.");
        }
    }

    public void  listele(List<Kullanici> kullanicilar){
        for (Kullanici each : kullanicilar){
            System.out.println("Adı: "+each.name+ " Kayıt Zamanı: "+each.kayitZamani);
        }
    }

}
