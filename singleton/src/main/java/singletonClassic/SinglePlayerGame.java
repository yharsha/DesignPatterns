package singletonClassic;

public class SinglePlayerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player sp = Player.getPlayerInstance();
		System.out.println(sp.getName());
	}

}
