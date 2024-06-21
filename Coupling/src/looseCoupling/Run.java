package looseCoupling;

public class Run 
{

	public static void main(String[] args) 
	{
		FreeFire obj1 = new FreeFire();
		Pubg obj2 = new Pubg();
		
		GameRunner runner = new GameRunner(obj1);
		runner.run();
		obj1.jump();

	}

}
