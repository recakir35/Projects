package Java_Projects.Projects_03_;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare: bu method parametre olara iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.

  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250

   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

  parametreleri kullanıcıdan alınız
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1.Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen 2.Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println(substSquare(sayi1, sayi2));

    }

    static int substSquare(int sayi1, int sayi2) {


        return getSumOfSquares(sayi1)+getSumOfSquares(sayi2);
    }

    private static int getSumOfSquares(int sayi1) {
        int toplam=0;
        for (int i = 0; i <= sayi1; i++) {
            toplam+=i;
        }
        return toplam*toplam;
    }


}
