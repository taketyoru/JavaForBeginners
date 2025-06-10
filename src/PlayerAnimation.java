
public class PlayerAnimation extends MyFrame
{

	public void run()
	{
		// TODO 自動生成されたメソッド・スタブ
		car player=new car(100,200,0,0);
		addKeyListener(player);
		while(true)
		{
			clear();
			player.draw(this);
			player.move();
			sleep(0.1);
		}
	}

}
