package Java_Projects.P01_FilmTahmin_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class
FilmTahmin {
    static Scanner scan = new Scanner(System.in);
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kontrol = false;
        int secilenFilm;
        System.out.println("*****  FİLM TAHMİN OYUNU ****");
        do {
            System.out.print("Lütfen 1-" + film.size() + " arası film nosu giriniz: ");
            secilenFilm = scan.nextInt() - 1;
            if (secilenFilm > film.size() || secilenFilm < 0) {
                System.out.println("Seçtiğiniz Film Sistemde yoktur. Lütfen 1-" + film.size() + " arasında bir rakam giriniz.");
                kontrol = true;
            }else  kontrol = false;
        } while (kontrol != false);

        String tahminEdilenHarf;
        int dogruTahmin = 0;
        int count = 1;
        int tahminHakki = film.get(secilenFilm).toUpperCase().length() * 2;
        List<String> tahminEdilenFilm = new ArrayList<>();

        System.out.println(film.get(secilenFilm).length() + " Karakterli yabancı bir film seçtiniz. Tahmin etme hakkınız: " + tahminHakki + " dir.");

        for (int i = 0; i < film.get(secilenFilm).length(); i++) { // Tahmin edilecek film - ile gizlenip ekrana getiriliyor.
            tahminEdilenFilm.add("-");
            System.out.print(tahminEdilenFilm.get(i) + " ");
        }

        while (tahminHakki >= count) {
            System.out.print("\nTahmininiz: " + count + " / Kalan Hakkınız: " + tahminHakki + " Bir harf giriniz: ");
            tahminEdilenHarf = scan.next().toUpperCase();

            for (int i = 0; i < film.get(secilenFilm).length(); i++) { //Tahmin edilen harf ile seçilen filmdeki harfleri karşılaştırıp ekrana yazdırıyor.
                if (film.get(secilenFilm).substring(i, i + 1).equalsIgnoreCase(tahminEdilenHarf)) {
                    tahminEdilenFilm.set(i, film.get(secilenFilm).substring(i, i + 1));
                    dogruTahmin++;
                }
                System.out.print(tahminEdilenFilm.get(i) + " ");
            }
            count++;
            if ((tahminHakki / 2) == dogruTahmin) { // Filmi tahmin ederse
                System.out.println("\nTebrikler... Tahmininiz Doğru");
                break;
            }
            if (tahminHakki == count) {// filmi tahmin edemez ise
                System.out.println("\nFilmi Tahmin edemediniz... Tahmin Hakkınız dolmuştur.");
                System.out.println("\nTahmin edemediğiniz film < " + film.get(secilenFilm) + " > idi");
            }

        }


    }

}

