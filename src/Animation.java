
public class Animation extends MyFrame{

	public void run() 
	{
		// TODO 自動生成されたメソッド・スタブ 5.1
		//int y=200;
		//int x=100;
		//	while (y>=100)
		//	{
		//		clear();
		//		setColor(0,128,0);
		//		fillOval(x,y,100,100);
		//		y-=5;
		//		sleep(0.1);
		//	}
		//	while (x<=200) 
		//	{
		//		clear();
		//		setColor(0,128,0);
		//		fillOval(x,y,100,100);
		//		x+=5;
		//		sleep(0.1);
		//	}
		//						5.2
//			int y=100;
	//		int x=30;
	//		while (y<=200) 
	//		{
	//			clear();
	//			setColor(0,128,0);
	//			fillOval(x,y,100,100);
	//			x+=5;
	//			y+=5;
	//			sleep(0.1);
	//		}
	//		while (x>=30)
	//		{
	//			clear();
	//			setColor(0,128,0);
	//			fillOval(x,y,100,100);
	//			x-=5;
	//			sleep(0.1);
	//		}
	//		while (y>=30)
	//		{
	//			clear();
	//			setColor(0,128,0);
	//			fillOval(x,y,100,100);
	//			x+=5;
	//			y-=5;
	//			sleep(0.1);
	//		}
		//						5.3
	//		int y=100;
	//		int x=30;
	//		for(int i = 0; i < 3; i++) 
	//		{
	//			while (x<=200) 
	//			{
	//				clear();
	//				setColor(0,128,0);
	//				fillOval(x,y,100,100);
	//				x+=5;
	//				sleep(0.1);
	//			}
	//			while (x>=30)
	//			{
	//				clear();
	//				setColor(0,128,0);
	//				fillOval(x,y,100,100);
	//				x-=5;
	//				sleep(0.1);
	//			}
	//		}
		//						EX
		int y = 100;
		int x = 30;
		while(true)
		{
			while (x<=200) 
			{
			clear();
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x+=5;
			sleep(0.1);
			}
			while (y<=200) 
			{
			clear();
			setColor(0,128,0);
			fillOval(x,y,100,100);
			y+=5;
			sleep(0.1);
			}
			while (x>=30) 
			{
			clear();
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x-=5;
			sleep(0.1);
			}
			while (y>=200) 
			{
			clear();
			setColor(0,128,0);
			fillOval(x,y,100,100);
			y-=5;
			sleep(0.1);
			}
		}
	}
}
