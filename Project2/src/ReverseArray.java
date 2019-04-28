import java.util.Scanner;

public class ReverseArray {
	
		public static void Reverse(String text) {			

		int l = 0;
		
		int r = text.length()-1;	
		
		char[] array = text.toCharArray();
		
		while (l < r) {
	
			if (Character.isLetter(array[r]) == false) {
				r--;
				}
						
				else if (Character.isLetter(array[l]) == false) {
				l++;
				}
						
				else {
							
					char a = array[r];
				
					array[r] = array[l];
				
					array[l] = a;
					
					l++;
				
					r--;
					}
				}
		
		for(int i = 0; i<=array.length-1; i++) {
			System.out.print(array[i]);
			}
		
		System.out.print(" ");
		}

				
public static void main (String... args) {	
			
	Scanner scan = new Scanner(System.in);	
				
	while (scan.hasNext()) {		
						
		Reverse(scan.next());
		}	
		System.out.print("Why this text does not appear?");	
		scan.close();				
		}
		
}