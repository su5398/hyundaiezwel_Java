package cpm.test01;

public class Thread05 {

	public static void main(String[] args) {
		for(int i=0; i<50; i++) {
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.print("%%");
		}

	}

}
