import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Manager implements IPersonManager {
    Map<Integer, Teacher> teacherList = new HashMap<>();
    Map<Integer, Student> studentList = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static String person;

    public void feykTeacher() {
        teacherList.put(1, new Teacher("Ali", "Cingöz", "89545678987", "5326425165", "20.05.1999", "Fizik", "527"));
        teacherList.put(2, new Teacher("Veli", "Aynalı", "62345678987", "5326420221", "20.05.1989", "Matematik", "655"));
        teacherList.put(3, new Teacher("Samet", "Yaşar", "45745678987", "5326429794", "20.05.2001", "Biyoloji", "789"));
        teacherList.put(4, new Teacher("Yasemin", "Sönmez", "35445678987", "5326428415", "20.05.1987", "Beden", "321"));
        teacherList.put(5, new Teacher("Gül", "Ateş", "24845678987", "5326423215", "20.05.1996", "Resim", "857"));
        teacherList.put(6, new Teacher("Ayşe", "Yarenli", "12345678987", "5326426878", "20.05.1976", "Türkçe", "942"));
    }

    @Override
    public void mainMenu() {
        System.out.println("   *** ANA MENÜ *** ");
        System.out.println("         1- ÖĞRETMEN İŞLEMLERİ" +
                "\n         2- ÖĞRENCİ İŞLEMLERİ" +
                "\n         Q-ÇIKIŞ");
        System.out.print("\t\tSeçiminizi yapınız: ");
        String scm = scan.next().toUpperCase();

        switch (scm) {
            case "1":
                person = "1";
                araMunu();
                break;
            case "2":
                person = "2";
                araMunu();
                break;
            case "Q":
                exit();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
                mainMenu();
        }
    }

    public void araMunu() {
        if (person.equals("1")) System.out.println("   ***   ÖĞRETMEN İŞLEMLERİ MENÜSÜ   ***  ");
        if (person.equals("2")) System.out.println("   ***   ÖĞRENCİ İŞLEMLERİ MENÜSÜ   ***  ");
        System.out.println("1-Ekleme\n2-Silme\n3-Arama\n4-Listeleme\nQ-Çıkış");
        System.out.print("Seçiminizi yapınız: ");
        String scm = scan.next().toUpperCase();
        switch (scm) {
            case "1":
                add();
                araMunu();
                break;
            case "2":
                delete();
                araMunu();
                break;
            case "3":
                search();
                araMunu();
                break;
            case "4":
                list();
                araMunu();
                break;
            case "Q":
                mainMenu();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
                araMunu();
        }
    }

    @Override
    public void add() {
        if (person.equals("1")) System.out.println("   ***   ÖĞRETMEN EKLEME   ***  ");
        if (person.equals("2")) System.out.println("   ***   ÖĞRENCİ EKLEME   ***  ");
        System.out.print("          İsminizi giriniz: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("          Soyisim giriniz: ");
        String surname = scan.nextLine();
        System.out.print("          Tc No giriniz: ");
        String tcno = scan.nextLine();
        System.out.print("          Telefon No giriniz: ");
        String phone = scan.nextLine();
        System.out.print("          Doğum Tarihi: ");
        String dateofbirth = scan.nextLine();
        if (person.equals("1")) {
            System.out.print("          Bölüm giriniz: ");
            String squad = scan.nextLine();
            System.out.print("          Sicil No giriniz:");
            String sicilNo = scan.nextLine();
            Teacher teacher = new Teacher(name, surname, tcno, phone, dateofbirth, squad, sicilNo);
            teacherList.put(idOlustur(), teacher);
            System.out.println(teacherList);
        } else {
            System.out.println("         Sınıf giriniz: ");
            String classroom = scan.nextLine();
            System.out.println("         Okul No giriniz: ");
            String schoolno = scan.nextLine();
            Student student = new Student(name, surname, tcno, phone, dateofbirth, classroom, schoolno);
            studentList.put(idOlustur(), student);
        }
    }

    public int idOlustur() {
        int id = 0;
        Set<Map.Entry<Integer, Teacher>> teacherEntry = teacherList.entrySet();
        for (Map.Entry<Integer, Teacher> each : teacherEntry) {
            for (int i = 0; i < teacherEntry.size(); i++) {
                if (!(each.getKey() == (i + 1))) {
                    id = i;
                    System.out.println("ah");
                }
            }
            if (id==0) id=(teacherList.keySet().size() + 1);
        }
        return id;
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void list() {
        if (person.equals("1")) System.out.println("   ***   ÖĞRETMEN LİSTELEME   ***  ");
        if (person.equals("2")) System.out.println("   ***   ÖĞRENCİ LİSTELEME   ***  ");
        Set<Map.Entry<Integer, Teacher>> entryTeacher = teacherList.entrySet();
        for (Map.Entry<Integer, Teacher> each : entryTeacher) {
            System.out.println(each.getKey() + ": " + each.getValue().surname);
        }
    }

    @Override
    public void exit() {

    }
}
