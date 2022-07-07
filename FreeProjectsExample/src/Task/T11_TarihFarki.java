package Task;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class T11_TarihFarki {


    public static void main(String[] args) throws ParseException {
        // Başlangıç
        String t1 = "10.06.2020 01:10:20";
        // Bitiş
        String t2 = "11.06.2021 07:30:50";

        tarihFarki(t1, t2);

    }
    //İki tarih arasındaki farkı bulan metod
    static void tarihFarki(String start_date, String end_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date d1 = sdf.parse(start_date);
        Date d2 = sdf.parse(end_date);
        long difference_In_Time = d2.getTime() - d1.getTime();

        long difference_In_Seconds = TimeUnit.MILLISECONDS.toSeconds(difference_In_Time) % 60;
        long difference_In_Minutes = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;
        long difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;
        long difference_In_Days = TimeUnit.MILLISECONDS.toDays(difference_In_Time) % 365;
        long difference_In_Years = TimeUnit.MILLISECONDS.toDays(difference_In_Time) / 365l;

        System.out.print("Tarih arasındaki fark: ");
        // Tarih yazdırma
        System.out.println(difference_In_Years + " yıl, " + difference_In_Days + " gün, " + difference_In_Hours
                + " saat, " + difference_In_Minutes + " dakika, " + difference_In_Seconds + " saniye");
    }

}


