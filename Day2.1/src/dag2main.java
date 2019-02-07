import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class dag2main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		String line;
		boolean totall;
		boolean tretall;
		while ((line = br.readLine()) != null) {
			List<Character> list = new ArrayList<Character>();
			Set<Character> unique = new HashSet<Character>();
			for (char c : line.toCharArray()) {
				list.add(c);
				unique.add(c);
			}
			int teller = 0;
			for (char c : list) {
				for (int i = 0; i < line.length(); i++) {
					if(c == line.charAt(i)) {
						teller++;
					}
				}
			}
		}

	}

}
