package Java_Projects.Projects_03_;

import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Dizisi giriniz: ");
        String str = scan.next();
        String arr[] = str.split("");
        int diziArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            diziArr[i] = Integer.parseInt(arr[i]);
        }

        threeEvenOrOdd(diziArr);

    }

    static boolean threeEvenOrOdd(int[] diziArr) {
        int ciftCount = 0;
        int tekCount = 0;
        boolean result = false;
        for (int i = 1; i <= diziArr.length; i++) {
            if (diziArr[i - 1] % 2 == 0) {
                ciftCount++;
            } else if (diziArr[i - 1] % 2 == 1) {
                tekCount++;
            }
        }
        if (tekCount >= 3 || ciftCount >= 3) {
            result = true;
        } else result = false;

        return result;
    }
}
