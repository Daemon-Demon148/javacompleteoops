package thread;
class counter 
{ Integer count=0;
	public  void increament()
	{
			count++;
	}
}
public class Synchronisationinthreading {

	public static void main(String[] args) throws Exception {
		counter c=new counter();
		//Runnable obj1=new Runnable();
		Thread t1=new Thread(new Runnable()
				{
				public void run()
				{
			for(Integer i=0;i<1000;i++)
			{
				c.increament();
			}
				}
				});
		t1.start();
		t1.join();
		System.out.println(c.count);
	}

}
