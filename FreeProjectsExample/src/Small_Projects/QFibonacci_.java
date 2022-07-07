package Small_Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci_ {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();

        List<Integer> fibonacci = new ArrayList<>(); //bir list oluşturuyoruz.
        fibonacci.add(1); // 1. index'e 1 veriyoruz
        fibonacci.add(1); // 2. index'e 1 veriyoruz
        System.out.print("FIBONACCI: ");
        for (int i = 0; i < sayi; i++) {  // 0'dan verilen sayıya kadar döngüye sokuyoruz.
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i+1)); // dizinin 1. elemanı ile 2. elemanını topluyor 3. indexe atıyor.
            System.out.print(fibonacci.get(i)+" "); // dizinin 1. elemanını yazdırıyor.
        }

    }
}
