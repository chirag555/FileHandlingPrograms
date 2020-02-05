import java.io.File;

public class FileCreation {
	public static void main(String[] args) {

		File file=new File("C:\\Users/mobiuso/Desktop/chirag/chirag.txt");
		try {
		file.createNewFile();
		System.out.println("File Created");
		}
		catch(Exception e)
		{
			System.out.println("Error in file stream");
		}
		
		 
	}

}
