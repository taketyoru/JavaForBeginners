import java.util.Vector;
public class DisplayCarVector extends MyFrame
{

	public void run()
	{
		// TODO 自動生成されたメソッド・スタブ
		Vector<car> faces = new Vector<car>();

		for (int i = 0; i < 5; i++)
		{
			faces.add(new car(50, 60 * i + 50, i + 1, 0));
		}
		while (true)
		{
			clear();

			for (int j = 0; j < faces.size(); j++)
			{
				faces.get(j).draw(this);
				faces.get(j).move();
			}
			sleep(0.03);
		}
	}

}
