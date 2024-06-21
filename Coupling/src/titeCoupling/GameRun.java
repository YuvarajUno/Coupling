package titeCoupling;

public class GameRun 
{
	//Pubg obj2;
	FreeFire obj;
	
	GameRun(FreeFire obj)
	{
		this.obj = obj;
	}
	
	void run()
	{
		obj.right();
		obj.left();
		obj.up();
		obj.down();
	}
}
	
