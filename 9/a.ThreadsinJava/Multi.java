public class Multi extends Thread
{
	public void run()
	{
		for(int i = 0; i <5; i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}

	}
	
	public static void main(String args[])
	{
		Multi t1 = new Multi();
		Multi t2 = new Multi();
		Multi t3 = new Multi();
		System.out.println(Thread.currentThread().getName());
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t3.start();
	}
}