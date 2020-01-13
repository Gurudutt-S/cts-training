//by extending thread class.



public class ThreadCreation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread-------starts");//By main thread only
		FirstThread firstThread= new FirstThread();//new born state
		SecondThread secondThread= new SecondThread();
		firstThread.start();//will call run 
		secondThread.start();
		
		//we have 2 threads....main and first thread.
		
		//main thread
//		for (int i=1; i<=5;i++)
//		{
//			System.out.println("Main thread:  "+i);
//			Thread.sleep(2000);
//		}
		
		
		
	}

}


//odd values
class FirstThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if (i%2!=0)
			{
			System.out.println("First Thread:  "+i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


//even values
class SecondThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println("Second Thread:  "+i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

