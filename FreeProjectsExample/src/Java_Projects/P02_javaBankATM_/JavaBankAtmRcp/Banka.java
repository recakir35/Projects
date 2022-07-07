package Java_Projects.P02_javaBankATM_.JavaBankAtmRcp;


import java.util.Scanner;

public class Banka {
    static Scanner scan = new Scanner(System.in);
    static double bakiye = 1000;


    public static void bakiyeSor() {                                // Bakiye Sorma Metodu
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.print("Başka işlem yapmak istiyormusunuz (E/H): ");
        char islem = scan.next().toUpperCase().charAt(0);
        if (islem == 'E') {
            JavaBankAtm.anaMenu();
        } else cikis();
    }

    public static void paraYatirma() {                              //Para Yatirma Metodu
        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
        double girilenMiktar = scan.nextDouble();
        bakiye += girilenMiktar;
        System.out.println("Paranız Yatırılmıştır. Bakiyeniz: " + bakiye);
        System.out.print("Başka işlem yapmak istiyormusunuz (E/H): ");
        char islem = scan.next().toUpperCase().charAt(0);
        if (islem == 'E') {
            JavaBankAtm.anaMenu();
        } else cikis();
    }

    public static void paracekme() {             // Para Çekme Metodu
        double cekilenTutar;
        do {
            JavaBankAtm.hataKontrol = false;
            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
            cekilenTutar = scan.nextDouble();
            if (cekilenTutar > bakiye) {
                System.out.println("Çekilen Miktar bakiyeden büyük olamaz. Bakiye: " + bakiye);
                JavaBankAtm.hataKontrol = true;
            }
        } while (JavaBankAtm.hataKontrol);
        bakiye -= cekilenTutar;
        System.out.println("Paranız veriliyor. Kalan bakiyeniz: " + bakiye);
        System.out.print("Başka işlem yapmak istiyormusunuz (E/H): ");
        char islem = scan.next().toUpperCase().charAt(0);
        if (islem == 'E') {
            JavaBankAtm.anaMenu();
        } else cikis();
    }

    static void paraGonderme() {                 // Para Gönderme Metodu
        double gonderilecekMiktar = 0;
        do {
            JavaBankAtm.hataKontrol = false;
            System.out.print("Gönderilecek para miktarını giriniz: ");
            gonderilecekMiktar = scan.nextDouble();
            scan.nextLine();
            if (gonderilecekMiktar > bakiye) {
                System.out.println("Gönderilecek Miktar Bakiyeden büyük olamaz. Bakiye:" + bakiye);
                JavaBankAtm.hataKontrol = true;
            } else {
                System.out.print("Lütfen IBAN No giriniz: ");
                String ibanNo = scan.nextLine();
                if (!ibanNo.substring(0, 2).equalsIgnoreCase("TR")) {
                    System.out.println("\n!!!HATA!!!....IBAN 'TR' ile başlamalı");
                    JavaBankAtm.anaMenu();
                }else if (ibanNo.length() < 26 ){
                    System.out.println("!!! HATA!!!... IBAN 26 karakter olmalı.");
                    JavaBankAtm.anaMenu();
                }
            }
        } while (JavaBankAtm.hataKontrol);
        bakiye -= gonderilecekMiktar;
        System.out.println("Paranız gönderilmiştir. Kalan Bakiye: " + bakiye);
        System.out.print("Başka işlem yapmak istiyormusunuz (E/H): ");
        char islem = scan.next().toUpperCase().charAt(0);
        if (islem == 'E') {
            JavaBankAtm.anaMenu();
        } else cikis();
    }

    static void sifreDegistirme() {                          // Şifre Değişikliği
        System.out.print("Eski Şifrenizi giriniz: ");
        int girilenSifre = scan.nextInt();
        System.out.print("Yeni Şifrenizi Giriniz: ");
        int yeniSifre = scan.nextInt();
        if (girilenSifre != JavaBankAtm.sifre) {
            System.out.println("\n!!!HATA!!!...Şifrenizi Değiştirmeniz için eski şifreyi doğru girmelisiniz.");
            JavaBankAtm.anaMenu();
        } else {
            JavaBankAtm.sifre = yeniSifre;
            System.out.println("Şifre değişikliğiniz yapılmıştır.");
        }
        System.out.print("Başka işlem yapmak istiyormusunuz (E/H): ");
        char islem = scan.next().toUpperCase().charAt(0);
        if (islem == 'E') {
            JavaBankAtm.anaMenu();
        } else cikis();
    }

    static void cikis() {                       // Çıkış
        System.out.println("Tekrar bekleriz...");
    }
}
