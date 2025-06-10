
public class DisplayCarsTrains extends MyFrame
{

	public void run() 
	{
		// TODO 自動生成されたメソッド・スタブ
		Vehicle[] vehicles=new Vehicle[6];
		vehicles[0]=new car(10,30,3,0);
		vehicles[1]=new car(10,100,5,0);
		vehicles[2]=new Train(10,180,7,0);
		vehicles[3]=new Train(10,240,10,0);
		vehicles[4]=new Truck(10,300,13,0);
		vehicles[5]=new Truck(10,360,16,0);
		for (int i=0; i<30; i++) 
		{
			clear();
			for (int j=0; j<vehicles.length; j++)
			{
				vehicles[j].draw(this);
				vehicles[j].move();
			}
			sleep(0.1);
		}
		
	}

}
