import java.util.Vector;
public class DisplayVehicleVector extends MyFrame
{

	public void run()
	{
		// TODO 自動生成されたメソッド・スタブ
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new car(10,30,3,0));
		vehicles.add(new car(10,100,5,0));
		vehicles.add(new car(10,150,7,0));
	
	
		for (int i=0; i<30; i++) 
		{
			clear();
			for (int j=0; j<vehicles.size(); j++)
			{
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}

	}
}
