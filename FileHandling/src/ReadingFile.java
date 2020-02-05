import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFile {
	public static void main(String[] args) {
		try {
			String line;
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\mobiuso\\Desktop\\chiragNewFolder1/chirag.txt"));
			while((line=br.readLine())!=null) {
				System.out.println(line);				
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error while writing");
		}
	}

}
