import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class car extends Vehicle implements KeyListener
{
	public car(int x, int y, int vx, int vy)
	{
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame)
	{
		frame.fillRect(x, y, 40, 20);
		frame.fillRect(x - 18, y + 20, 80, 20);
		frame.fillOval(x - 10, y + 40, 20, 20);
		frame.fillOval(x + 28, y + 40, 20, 20);
	}
	public void keyPressed(KeyEvent e)
	{
		System.out.println("キーが押されました");
		if (e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			vx=-5;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			vx=5;
		}
		if (e.getKeyCode()==KeyEvent.VK_UP)
		{
			vy=-5;
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			vy=5;
		}
	}
	public void keyReleased(KeyEvent e)
	{
		vx=0;
		vy=0;
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
}
