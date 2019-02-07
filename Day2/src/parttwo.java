import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class parttwo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int sum = 0;
		String line;
		boolean funnet = false;
		int[] liste = new int[1000000];
		int teller = 0;
		int tall = 99999999;

		funn: while (true) {
			try (BufferedReader br = new BufferedReader(new FileReader("Input.txt"))) {

				while ((line = br.readLine()) != null) {
					char operand = line.charAt(0);
					if (operand == "-".charAt(0)) {
						sum = sum - Integer.parseInt(line.substring(line.lastIndexOf("-") + 1));
						for (int i = 0; i < teller; i++) {
							if (sum == liste[i]) {
								tall = liste[i];
								break funn;
							}
						}
						liste[teller] = sum;
						teller++;
					}
					if (operand == "+".charAt(0)) {
						sum = sum + Integer.parseInt(line.substring(line.lastIndexOf("+") + 1));
						for (int i = 0; i < teller; i++) {
							if (sum == liste[i]) {
								tall = liste[i];
								break funn;
							}
						}
						liste[teller] = sum;
						teller++;
					}
				}
			}
		}
		System.out.println(tall);

	}

}
