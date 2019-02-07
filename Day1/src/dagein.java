import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class dagein {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("Input.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	char operand = line.charAt(0);
		    	if(operand == "-".charAt(0)) {
		    		sum = sum - Integer.parseInt(line.substring(line.lastIndexOf("-") +1));
		    	}
		    	if(operand == "+".charAt(0)) {
		    		sum = sum + Integer.parseInt(line.substring(line.lastIndexOf("+") +1));
		    	}
		    }
		}
		System.out.println(sum);
		
	}

}
