package Java_Projects.P02_javaBankATM_.JavaBankAtmRcp;

import Java_Projects.P02_javaBankATM_.JavaBankAtmRcp.Banka;

import java.util.Scanner;

class JavaBankAtm {
    static Scanner scan = new Scanner(System.in);
    static boolean hataKontrol = false;
    static int sifre = 4321;


   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */


    public static void main(String[] args) {
        String kartNo;

        do {
            System.out.print("Lütfen Kart No Yazınız: ");
            kartNo = scan.nextLine();
            hataKontrol = false;
            if (kartNo.length() < 16) {
                System.out.println("Hatalı Kart No Girdiniz. Lütfen Tekrar deneyiniz.");
                hataKontrol = true;
            } else {
                do {
                    hataKontrol = false;
                    System.out.print("Lütfen şifrenizi giriniz: ");
                    int girilenSifre = scan.nextInt();
                    if (sifre != girilenSifre) {
                        System.out.println("Hatalı Şifre Girdiniz. Lütfen Tekrar deneyiniz.");
                        hataKontrol = true;
                    }
                } while (hataKontrol);

            }
        } while (hataKontrol);

        anaMenu(); // Ana Menü

    }

    static void anaMenu() {
        System.out.println("\n******  A T M    M E N Ü *****");
        System.out.println("1-Bakiye Sorgulama\n2-Para Yatırma\n3-Para Çekme\n4-Para Gönderme\n5-Şifre Değiştirme\n6-Çıkış");
        System.out.print("Lütfen Seçiminizi Yapınız: ");
        char secim = scan.next().charAt(0);

        secimIslemi(secim); // Seçim Menüsü
    }

    static void secimIslemi(char secim) {

        switch (secim) {
            case '1':
                Banka.bakiyeSor();
                break;
            case '2':
                Banka.paraYatirma();
                break;
            case '3':
                Banka.paracekme();
                break;
            case '4':
                Banka.paraGonderme();
                break;
            case '5':
                Banka.sifreDegistirme();
                break;
            case '6':
                Banka.cikis();
                break;
            default:
                System.out.println("hatalı seçim yaptınız.");
        }
    }

}


