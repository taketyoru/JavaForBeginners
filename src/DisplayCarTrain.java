
public class DisplayCarTrain extends MyFrame
{

	public void run() 
	{
		// TODO 自動生成されたメソッド・スタブ
		car car1=new car(10,50,3,0);
		car1.draw(this);
		Train train1=new Train(30,150,3,0);
		train1.draw(this);
		Truck track1=new Truck(50,200,3,0);
		track1.draw(this);
	}

}
