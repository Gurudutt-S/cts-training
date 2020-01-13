
public class Stringbufferexample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Thoraipakkam");
		//sb.append("thiruvanthapuramkerala");
		sb.insert(0,"hello");
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());

	}

}


