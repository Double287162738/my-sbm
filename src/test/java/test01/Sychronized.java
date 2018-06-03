package test01;

public class Sychronized implements Runnable {

	
	private int index;
	
	public Sychronized() {
		index = 0;
	}
	@Override
	public void run() {
		synchronized(this) {
			for(int i=0;i<6;i++) {
				System.out.println(Thread.currentThread().getName()+":"+index++);
			}
		}
		
	}

}
