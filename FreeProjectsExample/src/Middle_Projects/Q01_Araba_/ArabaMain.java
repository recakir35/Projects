package Middle_Projects.Q01_Araba_;

import java.util.Scanner;

public class ArabaMain {

   public static void userCreat(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen Modeli giriniz: ");
       String model=scan.nextLine();
       System.out.println("Lütfen Renk giriniz: ");
       String renk=scan.nextLine();
       System.out.println("Lütfen Motor Hacmi giriniz: ");
       int motor=scan.nextInt();
       System.out.println("Lütfen Üretim Yılını giriniz: ");
       int yil=scan.nextInt();
       Araba arb1= new Araba(model,renk,motor,yil);
       System.out.println(arb1);

   }

    public static void main(String[] args) {
       userCreat();
    }
}
