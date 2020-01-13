
public class ThreadTest {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);// Daemon thread: they support main thread..Destroyed with the main thread.
		
		System.out.println("Name of the thread: "+thread.getName());
		thread.setName("CTS thread");
		System.out.println("Name of the thread: "+thread.getName());
		System.out.println("Is thread Deamon: "+thread.isDaemon());
		System.out.println("Is thread alive: "+thread.isAlive());
		System.out.println("Thread State: "+thread.getState());
		System.out.println("Thread  ID: "+thread.getId());
		
	}

}
