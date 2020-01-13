
public class Stringsplit {

	public static void main(String[] args) {
	
		String date= "Thursday 9 january 2020";
		String [] dates= date.split("\\d");
		for (int i=0;i<date.length();i++)
		{
			System.out.println(dates[i]);
		}

	}

}
