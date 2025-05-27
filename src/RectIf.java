
public class RectIf extends MyFrame{

	public void run() {
	
		// TODO 自動生成されたメソッド・スタブ
		setColor(0,128,0);
		int x=30;
	//	for (int i=0 ; i<9 ; i++)
	//		fillRect(x,x,10,100);
	//	x+=20;
	
	
	
	//	for (int i=0; i<10; i++)
	//	{
	//		fillRect(x,100,10,x);
	//		x +=20;	
	//	}
	
		
		int rgb = 0;
	//	for (int i=0; i<10; i++)
	//	{	
	//		rgb += 20;
	//		setColor(rgb,rgb,rgb);
	//		fillRect(x,100,10,100);
	//		x+=15;
	//	}
		
		for (int i=0; i<10; i++)
		{
			rgb -= 20;
			setColor(rgb,rgb,rgb);
			fillRect(x,100,10,100);
			x+=15;
		}

}}
