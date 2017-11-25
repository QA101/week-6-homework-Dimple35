import java.util.Scanner;
public class Palindrome2 {
	@SuppressWarnings("resource")
//Given an integer array is a palindrome or not 
		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter the numbers:");
			String str = console.nextLine(); 
			int halfLen = str.length()/2;
			int [] inputArr = new int[str.length()];
			int j = str.length()-1;
			for (int count=0; count < str.length(); count++) {
				inputArr[count] = Character.getNumericValue(str.charAt(count));
				
			}
			boolean cont = true;
			for (int i=0; i<halfLen; i++) {
				if (inputArr[i] != inputArr[j]) {
						System.out.println("String is not Palindrome");
						cont = false;
						break;
				}
				j--;
			}
			if (cont !=false) System.out.println("Palindrome");
		}
	}

		
		



