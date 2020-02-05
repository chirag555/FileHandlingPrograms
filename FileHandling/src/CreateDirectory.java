import java.io.File;
import java.io.IOException;
public class CreateDirectory {
public static void main(String[] args) {
	File dir=new File("C:\\Users\\mobiuso\\Desktop\\chiragNewFolder1");
	dir.mkdir();
	System.out.println("Directory Created");
	File file=new File("C:\\Users\\mobiuso\\Desktop\\chiragNewFolder1/chirag.txt");
	try {
		file.createNewFile();
		System.out.println("File Created");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
