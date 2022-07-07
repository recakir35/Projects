package Task;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T08_LocalDateYasHesaplatma {
    // Özel Tarih Formatı "dd.MM.YYYY" Doğumtarihini alıp yaşını hesaplatma

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Doğum Tarihinizi Giriniz(dd.MM.YYYY): ");
        String stringdate = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // Tarihsel Kodlarda birkez format pelirlemek gerekiyor.
        LocalDate formattedDate = LocalDate.parse(stringdate, formatter); // String alınan değer Local Date'e Çevirliyor.
        System.out.println("Dogum Tarihi: "+formatter.format(formattedDate)); // Kendimizin belirlediğimiz tarih formatını sadece stringe atayabiliriz.

        String bugunString=formatter.format(LocalDate.now()); // Günün tarihini önce Stringe çeviriyoruz
        LocalDate bugun = LocalDate.parse(bugunString, formatter); //String alınan değer Local Date'e Çevirliyor.
        System.out.println("Bugünün Tarihi: "+formatter.format(bugun));

        System.out.println("Yaşınız: "+Period.between(formattedDate, LocalDate.now()).getYears());
    }
}
