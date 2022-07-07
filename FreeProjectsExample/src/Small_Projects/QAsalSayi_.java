package Small_Projects;

public class QAsalSayi_ {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        System.out.println("***   100'den Küçük Asal Sayılar   ***");
        boolean asalSayiMi = true;

        for (int i = 1; i < 100; i++) { // 100 kadar olan sayıları tektek alıyoruz.
            for (int j = 1; j < i ; j++) {// i'de alınan sayı 1'den i!ye kadar olan sayılara bölünecek
                if (j != 1 && i % j == 0) { // Eger j= 1 değil ve i'nin j'ye bölümünden kalan 0 ise bu sayı asal değildir.
                    asalSayiMi = false;
                }
            }
            if (asalSayiMi) { // asal sayı olup olmadığı kontrol ediliyor.
                System.out.print(i + " ");
            }
            asalSayiMi = true;
        }
    }
}

