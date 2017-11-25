import java.util.Scanner;
public class Longest {
	@SuppressWarnings("resource")
	//Given a 10 numbers, find the longest subsequence of consecutive positive integers.
	//E.g. given [1,5,1,-1,1] return [1,5,1].
		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter 10 numbers:");
			int max = 0;
			int positiveCount = 0;
			int indexL = 0;
			int index = 0;
			int [] inputArr = new int[10];
			for (int count=0; count < 10 ; count++) {
				inputArr[count] = console.nextInt(); 
			}
			for (int i=0; i < 10; i++) {
				if (inputArr[i] > 0) {
					if (positiveCount == 0) {
						index= i;
					}
					positiveCount ++; 
				}
				if (inputArr[i] <= 0 || i==9) {
					if (positiveCount > max) {
						max = positiveCount;
						indexL=index;
						positiveCount = 0;
					}
				}
			}
			for (int j=indexL; j<=indexL+max-1; j++) {
				System.out.print(inputArr[j]+" ");
			}
		}

	}


