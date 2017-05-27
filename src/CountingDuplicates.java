import java.util.ArrayList;
import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		int numDouble = 0;
		ArrayList<String> chars = new ArrayList<String>();
		ArrayList<String> checked = new ArrayList<String>();
		
		for(char i : word.toCharArray()) {
			chars.add(i + "");
		}
		for(int i = chars.size() - 1; i >= 0; i--) {
			String cur = chars.get(i);
			chars.remove(i);
			if(!checked.contains(cur)) {
				if(chars.contains(cur.toLowerCase()) || chars.contains(cur.toUpperCase()) ) {
				numDouble++;
				}
			}
			checked.add(cur.toLowerCase());
			checked.add(cur.toUpperCase());
		}
		return numDouble;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				final String nextLine = scanner.nextLine();
				if (nextLine.trim().isEmpty()) break;
				
				System.out.println(duplicateCount(nextLine));
			}
		}
	}
}
