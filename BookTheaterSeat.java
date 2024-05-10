
public class BookTheaterSeat 	
{
	int total_seats=10;
	synchronized void bookSeats(int seats) //here using synchronized keyword synchronized method
	
	
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
}
class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats;
	public void run()
		{
			b.bookSeats(seats);
		}
	public static void main(String[] args) 
	{
		b=new BookTheaterSeat();
		// TODO Auto-generated method stub
		MovieBookApp Deepa=new MovieBookApp();
		Deepa.seats=7;
		Deepa.start();
		
		MovieBookApp Lila=new MovieBookApp();
		Lila.seats=6;
		Lila.start();
	}

}
