package Task;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon_ {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    static long num1Faktoriyel = 1;
    static long num2Faktoriyel = 1;
    static long farkFaktoriyel = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Lütfen Permütasyon ve Kombinasyon için n değerini giriniz: ");
        int n = scan.nextInt();
        System.out.print("Lütfen Permütasyon ve Kombinasyon için r değerini giriniz: ");
        int r = scan.nextInt();

        if (kombinasyon(n, r) == 0 || permutasyon(n, r) == 0) {
            System.out.println("n Sayısı, r sayısına eşit veya büyük olmalıdır. (n>=r)");
        } else {
            System.out.println("\n" + n + " ve " + r + " sayılarının Kombinasyonu= " + kombinasyon(n, r));
            System.out.println(n + " ve " + r + " sayılarının Permütasyonu= " + permutasyon(n, r));
        }
    }

    private static long permutasyon(int n, int r) {
        long permutasyon = 0;
        permutasyon = faktoriyel(n) / faktoriyel(n - r);
        return permutasyon;
    }

    private static long kombinasyon(int n, int r) {
        long kombinasyon = 0;
        kombinasyon = (faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r)));
        return kombinasyon;
    }

    // private static long faktoriyel(int sayi) {   // Bu şekilde yaptırılabilir.
    //     long faktoriyel = 1;
    //     for (int i = sayi; i > 0; i--) {
    //         faktoriyel *= i;
    //     }
    //     return faktoriyel;
    // }

    private static long faktoriyel(int sayi) {// *****  ozyinelemeli metodlar ===Recursive Mothods
        if (sayi <= 0) return 1;
        return sayi * faktoriyel(sayi - 1);
    }

}

