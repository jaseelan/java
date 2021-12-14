import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {

		try (FileReader jasee = new FileReader("C:\\Users\\Jasee\\OneDrive\\Desktop\\aab.txt")) {
			int i;
			while ((i = jasee.read()) != -1)
				System.out.println((char) i);
		}
	}
}
