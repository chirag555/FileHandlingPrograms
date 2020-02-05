import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileUsingScanner {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(new File("C:\\Users\\mobiuso\\Desktop\\chiragNewFolder1/chirag.txt"));
			String line;
			while((sc.hasNext())){
					line=sc.nextLine();
					System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
