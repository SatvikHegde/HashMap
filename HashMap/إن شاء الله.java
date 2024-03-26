import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
public class إن شاء الله {
	public static void main(String[] args) {
		HashMap m = new HashMap<String, String>();
		
		//adding to this map
		
		
		//get the scanner going
		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}
}
