import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		try {
			File myObj = new File("C:\\Users\\Jasee\\OneDrive\\Desktop\\a.txt");
			if (myObj.createNewFile()) {
				System.out.println("File create:" + myObj.getName());
				System.out.println("Absolute path:" + myObj.getAbsolutePath());

			} else {
				System.out.println("file already exits");
			}

		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();

		}
	}

}
