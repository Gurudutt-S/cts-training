import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NioProgram {

	public static void main(String[] args) throws IOException {
		
//		The default file system, obtained by invoking the FileSystems.getDefault method, 
//		provides access to the file system that isaccessible to the Java virtual machine. 
//		The FileSystems class definesmethods to create file systems 
//		that provide access to other types of (custom)file systems. 
		
		// 1. path interface , used to create path.
		FileSystem fs= FileSystems.getDefault();
		Path path=fs.getPath("C:\\Users\\LENOVO\\Desktop\\java programs\\new"); //we an seperate path using "c","desktop".
		Path path1=fs.getPath("C:\\Users\\LENOVO\\Desktop\\java programs\\new3");
		
		//path methods
		System.out.println("Name Count:      "+path.getNameCount());
		System.out.println("Is Absolute:      "+path.isAbsolute());
		System.out.println("Name of index 2:      "+path.getName(2));
		
		//Files.createDirectory(path);
		//Files.createFile(path);
		//Files.createDirectories(path);
		//Files.copy(path, path1);
		//Files.move(path, path1);
		//Files.delete(path1);
		boolean value=Files.exists(path1);
		System.out.println(value);
		
	}

}
