import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject{
	public static void main(String[] args) {
		Vehicle bike=new Vehicle("bike",6543);
		Vehicle car=new Vehicle("car",5436);
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\mobiuso\\Desktop\\ChiragNewFolder1\\Vehicle.dat")){
			try(ObjectOutputStream obj=new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("object written");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception");
		}				
	}
}
