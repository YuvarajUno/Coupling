package titeCoupling;

public class Run
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FreeFire fre = new FreeFire();
		//Pubg pubg    = new Pubg();
		
		GameRun running = new GameRun(fre);
		running.run();
		

	}

}
