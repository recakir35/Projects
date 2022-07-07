package Task;

import java.util.Scanner;

public class T02_IkininKuvveti_ {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif tam sayı giriniz: ");
        int num = scan.nextInt();

        PowersofTwo(num);
    }

    private static void PowersofTwo(int num) {
        boolean kontrol = false;
        for (int i = 1; i <Integer.MAX_VALUE; i=i*2) {

            if (num ==i) {
                kontrol = true;
                break;
            }
            if (i>num) break;
        }
        if (kontrol==true){
            System.out.println(num+ " sayısı 2'nin kuvvetidir.");
        }else System.out.println(num + " 2'nin kuvveti DEĞİLDİR");
    }


}

