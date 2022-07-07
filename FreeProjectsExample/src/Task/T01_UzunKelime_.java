package Task;

import java.util.Scanner;

public class T01_UzunKelime_ {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String sentence = scan.nextLine();

        System.out.println("Cümledeki en uzun kelime: < " +LongestWord(sentence)+ " >");
    }

    private static String LongestWord(String sentence) {
        String bosSentence[] = sentence.split(" ");
        int kelimeMax = Integer.MIN_VALUE;
        String maxKelime = "";

        for (int i = 0; i < bosSentence.length; i++) {
            if (kelimeMax < bosSentence[i].length()) {
                kelimeMax = bosSentence[i].length();
                maxKelime = bosSentence[i];
            }
        }
        return maxKelime;
    }
}