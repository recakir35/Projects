package Small_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_ {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */
Scanner scan = new Scanner(System.in);
		System.out.println("Anagram için 1.Değeri giriniz: ");
		String str1= scan.nextLine().toLowerCase();
		System.out.println("Anagram için 2.Değeri giriniz: ");
		String str2= scan.nextLine().toLowerCase();

		if (isAnagram(str1, str2)){
			System.out.println("Verilen İki Stringin Anagram durumu True'dur");
		}else System.out.println("Verilen İki Stringin Anagram durumu False'dir");
	}

	private static boolean isAnagram(String str1, String str2) {
		char arr1[]=str1.replace(" ","").toCharArray();// Sıralama yapılacağı için diziye atılıyor.
		char arr2[]=str2.replace(" ","").toCharArray(); // toCharArray() Stringi Diziye atar
		Arrays.sort(arr1); // sıralama yapılıyor
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		if (str1.length()!=str2.length()){
			return false;
		}

		for (int i = 0; i <arr1.length ; i++) {
			if (arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
