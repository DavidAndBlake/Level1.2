
public class NetflixRunner {

	public static void main (String[] args)
	{
		Movie shortCircuit = new Movie("Short Circuit", 4);
		Movie zootopia = new Movie("Zootopia", 4);
		Movie avengers = new Movie("Avengers", 5);
		Movie theRoom = new Movie("The Room", 1);
		Movie imitationGame = new Movie("Imitation Game", 5);
		System.out.println("A ticket to see Short Circuit? " + shortCircuit.getTicketPrice());
		System.out.println("A ticket to see Zootopia? " + zootopia.getTicketPrice());
		System.out.println("A ticket to see The Avengers? " + avengers.getTicketPrice());
		System.out.println("A ticket to see The Room? " + theRoom.getTicketPrice());
		System.out.println("A ticket to see Imitation Game? " + imitationGame.getTicketPrice());
		NetflixQueue queue= new NetflixQueue();
	}
}
