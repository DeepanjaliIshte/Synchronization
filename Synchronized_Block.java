// Synchronized Block 
class Synchronized_Block
{
	
}
class BookTheaterSeat_2	
{
	int total_seats=10;
	void bookSeats(int seats) 
	{
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println();
		
		synchronized(this) // this can be use object reference
		{
		if(total_seats >=seats)
			{
			System.out.println(seats+" seats booked successfully");
			total_seats= total_seats-seats;
			System.out.println(" seats left "+total_seats);
			}
		else 
			{
			System.out.println("Sorry seats cannot be booked...!");
			System.out.println("Seats Left : "+total_seats);
			}
		}
		
		System.out.println();
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
		System.out.println("hi synchronized block : "+Thread.currentThread().getName());
	}
}
class MovieBookApp_2 extends Thread{
	static BookTheaterSeat_2 b;
	int seats;
	public void run()
		{
			b.bookSeats(seats);
		}
	public static void main(String[] args) 
	{
		b=new BookTheaterSeat_2();
		// TODO Auto-generated method stub
		MovieBookApp_2 Deepa=new MovieBookApp_2();
		Deepa.seats=7;
		Deepa.start();
		
		MovieBookApp_2 Lila=new MovieBookApp_2();
		Lila.seats=6;
		Lila.start();
	}
}


