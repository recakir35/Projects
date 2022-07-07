package Java_Projects.Projects_03_;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {

        System.out.println(camelcase());
    }

    static String camelcase() {
        String str = "I lİVe ın uSa";
        String dizi[] = str.split(" ");
        String strDonen = "";

        for (String each : dizi) {
            strDonen += each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase()+ " ";
        }
        return strDonen.trim();
    }
}
