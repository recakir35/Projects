package Java_Projects.P10_aracKiralama;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class AracKiralamaIslemleri extends Arac {
    static List<Arac> aracKiralama = new ArrayList<Arac>();
    static List<Arac> araclar = new ArrayList<Arac>();
    static Scanner scan = new Scanner(System.in);

    public static void aracKiralama() {
      System.out.print("Aracı Alacağınız Tarihi giriniz(dd.MM.YYYY): ");
      String alacagiTarih = scan.nextLine();
      System.out.print("Aracı Alacağınız Saat(HH.hh): ");
      String alacagiSaat = scan.nextLine();
      System.out.print("Aracı Teslim Edeceğini Tarihi giriniz(dd.MM.YYYY): ");
      String teslimTarih = scan.nextLine();
      //scan.nextLine();//dumy
      System.out.print("Aracı Teslim Edeceğiniz Saat(HH.hh): ");
      String teslimSaat = scan.nextLine();
      Arac akira = new Arac(alacagiTarih, alacagiSaat, teslimTarih, teslimSaat);
      aracKiralama.add(akira);
     // //**** tarih farkı hesaplama****
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

      System.out.println("Araç Alacağı Tarihi: " + alacagiTarih);
      LocalDate alacaTar = LocalDate.parse(alacagiTarih, formatter);

      System.out.println("Araç Teslim Tarihi: " + teslimTarih);
      LocalDate teslimTar = LocalDate.parse(teslimTarih, formatter);

        System.out.println("Araç Kiralanacağı Gün: "+Period.between(alacaTar,teslimTar ));

      System.out.println("Müşteri Kayıt İşlemi Yapılmıştır. Başka Kayıt yapmak istermisiniz(E/H): ");
      char istem = scan.next().charAt(0);
      if (istem == 'E') {
          aracKiralama();
      } else Cikis();
    }

    public static void musteri() {
        System.out.println("Müşteri Adı ve Soyadını giriniz: ");
        String musteriAdSoyad = scan.nextLine();
    }

    public static void maracSecimi() {

    }

    public static void odeme() {

    }

    public static void aracBilgiGirme() {
        System.out.println("   ***   ARAÇ KAYIT EKRANI   ***   ");
        System.out.println("Araç Markası: ");
        String marka = scan.nextLine();
        System.out.println("Araç Modeli: ");
        String model = scan.nextLine();
        System.out.println("Yakıt Tipi: ");
        String yakıt = scan.nextLine();
        System.out.println("Vites Tipi: ");
        String vites = scan.nextLine();
        System.out.println("Günlük Ücret: ");
        Double gUcret = scan.nextDouble();
        Arac arac = new Arac(marka, model, yakıt, vites, gUcret);
        araclar.add(arac);
        System.out.println("Araç Kayıt İşlemi Yapılmıştır. Başka Kayıt yapmak istermisiniz(E/H): ");
        char istem = scan.next().charAt(0);
        if (istem == 'E') {
            aracBilgiGirme();
        } else Cikis();
    }




    public static void Cikis() {
        System.out.println("Yine bekleriz...");
    }


}
