package cpm.test01;

//Runnable
public class Thread01 implements Runnable{
	 
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("i = "+i);
		}
	}
	
}
