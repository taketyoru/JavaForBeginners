
public class DisplayRectsSlow extends MyFrame {

	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		setColor(0,128,0);
		int x=30;
		while (x<=170) 
		{
			fillRect(x,x,10,100);
			x+=20;
			sleep(1);
		}
	}

}
