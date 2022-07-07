package P11_depoYonetimi_;

import static P11_depoYonetimi_.UrunIslemler.scan;

public class TrayCatch {

    public int trayCatch() {
        int sayi = 0;

        while (true) {
            try {
                sayi = scan.nextInt();
                if (sayi < 0) throw new ArithmeticException();
                break;
            } catch (ArithmeticException e) {
                scan.nextLine();
                System.out.print(UrunIslemler.R + "Girilen değer sıfırdan küçük olamaz."+UrunIslemler.B+"\nTekrar giriniz: " );
            } catch (Exception e) {
                scan.nextLine();
                System.out.print(UrunIslemler.R + "Girilen değer rakam olmalıdır."+UrunIslemler.B+"\nTekrar giriniz: ");
            }

        }
        return sayi;
    }
}
