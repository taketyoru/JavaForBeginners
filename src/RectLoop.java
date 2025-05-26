
public class RectLoop extends MyFrame{

	public void run()
	{
		// TODO 自動生成されたメソッド・スタブ
		setColor(0,128,0);
		int x=30;
		for (int i=0 ; i<10 ; i++)
		{
			System.out.println(x);
			fillRect(x,80,10,100);
			x+=20;
		}
	}

}
