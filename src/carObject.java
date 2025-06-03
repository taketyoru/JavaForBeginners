
public class carObject extends MyFrame
{
	public void run()
	{
		car face1 = new car(50, 50, 10, 0);
		car face2 = new car(300, 150, -10, 0);
		face1.draw(this);

		for (int i = 0; i < 30; i++) 
		{
			clear();
			face1.draw(this);
			face1.move();
			face2.draw(this);
			face2.move();
			sleep(0.1);
		}
	}

}
