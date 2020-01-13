//lambda function used instead of anonymous function
//only 1 method in one interface
//@FunctionalInterface


public class LambdaProgram {

	public static void main(String[] args) {
		Hello h= (a,b) ->{
			return a+b;
		};
		System.out.println(h.add(2,3));
	}

}

interface Hello
{
	public int add(int a,int b);
}