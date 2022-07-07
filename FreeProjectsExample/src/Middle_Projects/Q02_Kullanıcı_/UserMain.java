package Middle_Projects.Q02_Kullanıcı_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    static Scanner scan = new Scanner(System.in);
    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        userKayit();

    }

    private static void userKayit() {
        int userid = 0;
        Random rnd = new Random();
        while (true) {
            System.out.print("Lütfen Kullanıcı ismi giriniz: ");
            String userName = scan.nextLine();
            String pasword;
            while (true) {
                System.out.print("Lütfen parola giriniz: ");
                pasword = scan.nextLine();
                if (pasword.length() < 6) {
                    System.out.println("Hatalı Şifre 6 karakterden küçük olamaz");
                }else break;
            }
            boolean active = rnd.nextBoolean();
            boolean signedIn = rnd.nextBoolean();
            User kullanici = new User(userid, userName, pasword, active, signedIn);
            userList.add(kullanici);
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(userList.get(i));
            }
            System.out.print("Başka Kayıt girmek istiyormusunuz(E/H): ");
            String secim = scan.next().toUpperCase();
            if (secim.equals("H")) break;
            userid++;
            scan.nextLine();
        }
    }


}
