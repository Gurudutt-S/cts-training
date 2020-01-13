import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferIO {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the text: ");
		String txt=br.readLine();
		System.out.println(txt);

	}

}
