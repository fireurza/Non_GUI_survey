import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assginment_3_reader {
	static int countOccurrences(int num[], int n, int x) {
		int res = 0;
		for (int i=0; i<n; i++) {
			if (x == num[i]) {
				res++;
			}				
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		try {
			File myObj = new File("responses.txt");
			Scanner myReader = new Scanner(myObj);
			List<Integer> number = new ArrayList<Integer>();
			String token1;
			while (myReader.hasNextLine()) {
				//String data = myReader.nextLine();
				token1 = myReader.next();
				number.add(Integer.parseInt(token1));
			}
						
			int size = number.size();
			int [] num = new int[size];
			Integer [] temp = number.toArray(new Integer[size]);
			for (int n = 0; n < size; ++n) {
				num[n] = temp[n];
			}
			Arrays.sort(num);
			int n = num.length;
			System.out.println("Number     Frequency");
			System.out.println("  1            " + countOccurrences(num, n, 1));
			System.out.println("  2            " + countOccurrences(num, n, 2));
			System.out.println("  3            " + countOccurrences(num, n, 3));
			System.out.println("  4            " + countOccurrences(num, n, 4));
			System.out.println("  5            " + countOccurrences(num, n, 5));
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
}


