import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3 {
	public static void main(String[] args) throws IOException {
		Scanner myscale = new Scanner(System.in);
		String score;
		
		System.out.println("Student 1, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating1 = score;
		
		System.out.println("Student 2, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating2 = score;
		
		System.out.println("Student 3, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating3 = score;
		
		System.out.println("Student 4, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating4 = score;
		
		System.out.println("Student 5, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating5 = score;
		
		System.out.println("Student 6, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating6 = score;
		
		System.out.println("Student 7, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating7 = score;
		
		System.out.println("Student 8, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating8 = score;
		
		System.out.println("Student 9, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:");
		score = myscale.nextLine();
		String rating9 = score;
		
		System.out.println("Student 10, rate the caffeteria food on a scale of 1 to 5 with 5 being the best and 1 being the worst:1");
		score = myscale.nextLine();
		String rating10 = score;
		
		File myFile = new File("responses.txt");
		myFile.createNewFile();
		
		try {
			FileWriter myWriter = new FileWriter("responses.txt");
			myWriter.write(rating1);
			myWriter.write("\n" + rating2);
			myWriter.write("\n" + rating3);
			myWriter.write("\n" + rating4);
			myWriter.write("\n" + rating5);
			myWriter.write("\n" + rating6);
			myWriter.write("\n" + rating7);
			myWriter.write("\n" + rating8);
			myWriter.write("\n" + rating9 );
			myWriter.write("\n" + rating10);
			myWriter.close();	
			System.out.println("Responses writen to file");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}		
		
	}
	
	

}
