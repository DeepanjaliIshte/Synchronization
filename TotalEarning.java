
public class TotalEarning extends Thread
{
	int total=0;
	public void run()
	{
		synchronized (this)
		{	
	
		for(int i=1;i<=10;i++)
		{
			total=total+100;
		}
		this.notify();
	}
}
}
class MovieBook
{
	public static void main(String[] args) throws  InterruptedException
	{
		TotalEarning te=new TotalEarning();
		te.start();
	synchronized (te)
		{
			te.wait();
			System.out.println(" Toatal earning "+te.total+" Rs.");
			
		}
	}

}
