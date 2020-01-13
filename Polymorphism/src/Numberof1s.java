import java.util.Scanner;

public class Numberof1s {

	public static void main(String[] args) {
		int upper, lower,count=0,mod = 0,n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the lower limit");
		lower=scanner.nextInt();
		System.out.println("enter the upper limit");
		upper=scanner.nextInt();
		for(int i=lower;i<=upper;i++)
		{
			n=i;
			while(n!=0)
			{
				mod=n%10;
				n=n/10;
				if(mod==1)
				{
					count=count+1;
				}
			}
		}
		System.out.println(count);

	}

}
