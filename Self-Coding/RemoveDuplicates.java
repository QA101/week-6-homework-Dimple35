import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RemoveDuplicates {
	// Remove duplicate characters in a string: Given a string "banana", return unique string "ban"
	public static void main(String[] args) {
		char s;
		Scanner console = new Scanner(System.in);
		Map <Character, Integer> map = new HashMap<Character, Integer> ();
		System.out.println("Enter a string:");
		String str = console.next().toLowerCase(); 
		for (int i=0; i<=str.length()-1; i++) {
		    s = str.charAt(i);
		    if (!map.containsKey(s)) {  // first time we've seen this string
		      map.put(s, 1);
		    }
		 }
		 for (Character c : map.keySet()) {
			System.out.print(c);
		 }
	}

}
