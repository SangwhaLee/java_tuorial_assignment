package A08_2;

import java.util.*;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayList<String> list = new ArrayList<String>(
		Arrays.asList(
			"Malfurion",
			"Uther",
			"Thrall",
			"Guldan",
			"Anduin",
			"Rexxar",
			"Jaina",
			"Valeera",
			"Garrosh")
		);
		try(final Scanner scanner = new Scanner(System.in); final WordBook
		wordbook = new WordBook(list))  {
			while(wordbook.getSize()>0) {
				String name = scanner.nextLine();
				wordbook.enter(name);
				System.out.flush();
			}
		} 
		catch(Exception err) {
			err.printStackTrace();
		} 
		finally {
			System.out.println("Program finished");
		}
	}

}
