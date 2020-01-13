import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {

//		//provide path and file name
//		String path="C:\\Users\\LENOVO\\Desktop\\java programs\\Day_11\\src\\data.txt";
//		
//		//fileInputStream class
//		FileInputStream fin=new FileInputStream(path);
//		
//		//reading data from file
//		int i;
//		while((i=fin.read()) !=-1)
//		{
//			System.out.print((char)i);//converting integer to char to get the characters.
//		}
//		fin.close();
		
		
		//READING FILE AND PRINTING IN ANOTHER FILE
		// provide path and file name
		String path = "C:\\Users\\LENOVO\\Desktop\\java programs\\Day_11\\src\\data.txt"; //absolute path

		// fileInputStream class
		FileInputStream fin = new FileInputStream(path);
		FileOutputStream fout=new FileOutputStream("Copied.txt");//creating object of output.//relative path.

		// reading data from file
		int i;
		while ((i = fin.read()) != -1) {
			fout.write(i);     //writing to another file.
		}
		fin.close();
		fout.close();
	}

}
