import java.util.Scanner;
public class Palindrome1 {
@SuppressWarnings("resource")
//Given a string is a palindrome or not
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = console.nextLine().toLowerCase(); 
		int halfLen = str.length()/2;
		int j = str.length()-1;
		boolean cont = true;
		for (int i=0; i<halfLen; i++) {
			if (str.charAt(i) != str.charAt(j)) {
					System.out.println("String is not Palindrome");
					cont = false;
					break;
			}
			j--;
		}
		if (cont !=false) System.out.println("Palindrome");
	}
}

	
	


