//Static Synchronization keyword program
public class Static_Synchronization_Demo 	
	{
	}
class BookTheaterApp
	{
	static int total_Seats=20;
		static synchronized void bookseat(int seats)
		{
			if(total_Seats>=seats)
			{
				System.out.println(seats+" Seats booked successfully");
				total_Seats=total_Seats-seats;
				System.out.println("Seats Left : "+total_Seats);
			}
			else
			{
				System.out.println("Seats cannot be booked");
				System.out.println("Seats Left");
			}
		}
	}
class MYThread1 extends Thread
	{
		BookTheaterApp bta;
		int seats;
		public MYThread1(BookTheaterApp bta,int seats) 
		{
			// TODO Auto-generated constructor stub
			this.bta=bta;
			this.seats=seats;
		}
		
		public void run() {
			bta.bookseat(seats);
		}
	}
class MYThread2 extends Thread
{
	BookTheaterApp bta;
	int seats;
	public MYThread2(BookTheaterApp bta,int seats) {
		this.bta=bta;
		this.seats=seats;
	}
	public void run() {
		bta.bookseat(seats);
	}
}
class MovieBookApplication{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BookTheaterApp bta1=new BookTheaterApp();
		 
		 MYThread1 mt1=new MYThread1(bta1,7);
		 mt1.start();
		 MYThread2 mt2=new MYThread2(bta1,6);
		 mt2.start();
		 
		 
		 //---------------------------------------
		 
		 
		 BookTheaterApp bta2=new BookTheaterApp();
		 
		 MYThread1 mt3=new MYThread1(bta2,5);
		 mt3.start();
		 MYThread2 mt4=new MYThread2(bta2,9);
		 mt4.start();
		 
	}

}
