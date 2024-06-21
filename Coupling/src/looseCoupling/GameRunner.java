package looseCoupling;

public class GameRunner
{

	GamingConsole game;
	 
	GameRunner(GamingConsole game)
	{
		this.game = game;
	}
	
	public void run()
	{
		game.right();
		game.left();
		game.up();
		game.down();
	}
	

}
