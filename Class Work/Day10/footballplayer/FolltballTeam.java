package footballplayer;

public class FolltballTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Football f = new Football("Accosiation", 50, 1);
		FootballPlayer p1 = new FootballPlayer("harsh", f);
		
		System.out.println("Player : " + p1.getPlayerName() + "\nFootball Type : " + f.getType() + "\nFootball Size : " + f.getSize() + "\nFootball Waight : " + f.getWaight());

	}

}
