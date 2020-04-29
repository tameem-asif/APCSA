package APractice1;

public class HotelTest {
	
	public static void main(String[]args)
	{
		Hotel w = new Hotel(new Reservation[6]);
		w.requestRoom("Mullen");
		w.requestRoom("Burbine");
		w.requestRoom("Rawlins");
		w.requestRoom("Field");
		w.requestRoom("Thurston");
		w.requestRoom("Trimm");
		w.requestRoom("Hill");
		w.requestRoom("Peltier");
	
		w.printRes();
		w.printWaitlist();
		
		w.cancelAndReassign(w.getRes(0));

		w.printRes();
		w.printWaitlist();

		
	}
}
