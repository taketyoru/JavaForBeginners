
public class RectIf extends MyFrame{

	public void run()
	{
		// TODO 自動生成されたメソッド・スタブ
		setColor(0,128,0);
		int x=30;
		for (int i = 0 ; i<9 ; i++)
		{
			if (i==4) 
			{
				fillRect(x,100,10,100);
			}
			else 
			{
				fillRect(x,80,10,100);
			}
				x+=20;
		}
	}
	

}
