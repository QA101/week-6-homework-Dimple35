import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FindDuplicates {
//Find duplicate characters in a String and count the number of occurrences of the duplicate characters
	public static void main(String[] args) {
			char s;
			Scanner console = new Scanner(System.in);
			Map <Character, Integer> map = new HashMap<Character, Integer> ();
			System.out.println("Enter a string:");
			String str = console.next(); 
			for (int i=0; i<=str.length()-1; i++) {
			    s = str.charAt(i);
			    if (!map.containsKey(s)) {  // first time we've seen this string
			      map.put(s, 1);
			    }
			    else {
			      int count = map.get(s);
			      map.put(s, count + 1);
			     }
			 }
			 for (Character c : map.keySet()) {
				Integer occurance = map.get(c);
				if (occurance > 1) {
					System.out.println(c + "," + occurance);
				}  
			 }
	}
}

