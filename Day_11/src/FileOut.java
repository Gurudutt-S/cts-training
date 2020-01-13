import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOut {

		public static void main(String[] args) throws IOException {
			
			//path
			String path="C:\\Users\\LENOVO\\Desktop\\java programs\\Day_11\\src\\data.txt";
			
			//file class
			File file=new File(path);
			System.out.println("Can Execute..?:	"+file.canExecute());
			System.out.println("Can Read..?:	"+file.canRead());
			System.out.println("Can Write..?:	"+file.canWrite());
			System.out.println("File Exists..?:	"+file.exists());
			System.out.println("Absolute path..?:	"+file.getAbsolutePath());
			
			System.out.println("File Name..?:	"+file.getName());
			System.out.println("Write data");
			
			
			//fileOutputestrem class
			FileOutputStream fout=new FileOutputStream(path,true);
			//if we give true, file will be appended. else it will be overrided.
			
			//message
//			String msg="Welcome to file handling";
			
			//taking file from user
			Scanner sc=new Scanner(System.in);
			String msg=sc.nextLine();
			
			//converting to byte array
			byte[] b=msg.getBytes();
			
			//write to file
			fout.write(b);
			fout.close();
			
		}


}
