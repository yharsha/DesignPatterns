package singletonClassic;


public class Player {
	
	private static Player singlePlayer;
	private String name;
	private Player()
	{
		setName("SinglePlayer");
	}
	
	public static Player getPlayerInstance()
	{
		if(singlePlayer==null)
			singlePlayer=new Player();
		return singlePlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

/*https://www.geeksforgeeks.org/singleton-design-pattern/*/
