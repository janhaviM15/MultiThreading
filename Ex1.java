package multithreading;

public class Ex1 extends Thread
{
	
	public void run()
	{
		System.out.println("Thread is Running!!..");
		
	}

	public static void main(String[] args) 
	{
		Ex1 e1 = new Ex1();
		e1.start();
	}

}
