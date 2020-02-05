import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {
	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\mobiuso\\Desktop\\ChiragNewFolder1");
		file.mkdir();
		file=new File("C:\\Users\\mobiuso\\Desktop\\chiragNewFolder1/chirag.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating file");
		}
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))) {
			bw.write("chirag");
			bw.newLine();
			bw.write("Kaushik");
			bw.newLine();
			bw.write("space");
			System.out.println("writing onto the file completed");	
			bw.close();
		} catch (IOException e) {
			System.out.println("error occured");
		}
	}
}
