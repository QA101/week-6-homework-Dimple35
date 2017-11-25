
import java.util.Scanner;
public class reverse {
@SuppressWarnings("resource")
//Given two strings determine if 2 strings are backwards of each other
//(both the strings have same set of characters)
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String str1 = console.next().toLowerCase(); 
		System.out.println();
		System.out.println("Enter 2nd string:");
		String str2 = console.next().toLowerCase(); 
		int j = str2.length()-1;
		boolean cont = true;
		if (str1.length() != str2.length()) {
			System.out.println("Strings' length are not equal");
		}
		else {
		for (int i=0; i<=str1.length()-1; i++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					
					j--;
				}
				else {
					System.out.println("Strings are not anagram");
					cont = false;
					break;
				}
		}
		if (cont !=false) System.out.println("Anagram");
		}
	}
}
