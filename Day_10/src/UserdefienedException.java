
public class UserdefienedException {
public static boolean isValidUser(String user)throws InvalidUser{
	if(!user.equalsIgnoreCase("ADMIN")) {
		throw new InvalidUser("Invalid");
	}
	return true;
}
	public static void main(String[] args){
		try {
			isValidUser("admin");
		}
		catch(InvalidUser e) {
			System.out.println(e.getMessage());
		}

	}

}

class InvalidUser extends Exception
{
	public char[] getMessage;
	public InvalidUser()
	{
		
	}
	InvalidUser(String message)
	{
		System.out.println(message);
	}
	public String getMessage()
	{
		return "This is invalid";
	}
}