import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileDeletion {

	public static void main(String[] args) {
		String cmd;
	

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter name of the file");
			String name = sc.nextLine();
			File file = new File("C:\\Users\\mobiuso\\Desktop\\ChiragNewFolder1\\delete");
			file.mkdir();
			System.out.println("Directory Created\n***************");
			file = new File("C:\\Users\\mobiuso\\Desktop\\ChiragNewFolder1\\delete\\" + name + ".txt");

			file.createNewFile();
			System.out.println("File Created Succesfully\n***************");

			System.out.println("Enter Command  yes to delete");
			cmd = sc.nextLine();
			if (cmd.equalsIgnoreCase("yes")) {
				if (file.delete()) {
					System.out.println("\n***************Deletion Succesful\n***************");
				}
			} else {
				System.out.println("***************\nDoesn't matter :) ");
				if (file.delete()) {
					System.out.println("***************\nDeletion Succesful\n***************");
				}
			}

		} catch (IOException e) {
			System.out.println("error");
		}

	}

}
