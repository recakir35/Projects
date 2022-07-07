package Java_Projects.Projects_03_;

public class getPopulation {

    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) alacak

     countryNames Ülke isimleri

     countryPopulations Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

      countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */


    public static void main(String[] args) {
        String countryNames[] = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};
        int countryPopulations[] = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};
        String str = "Eritrea";

        System.out.println(populationOfCountry(countryNames, countryPopulations, str));

    }

    static int populationOfCountry(String[] countryNames, int[] countryPopulations, String str) {

        int ulkeNufusu = 0;

        for (int i = 0; i < countryNames.length; i++) {
            if (str.equalsIgnoreCase(countryNames[i])) {
                ulkeNufusu = countryPopulations[i];
                break;
            } else ulkeNufusu = -1;
        }


        return ulkeNufusu;

    }


}
