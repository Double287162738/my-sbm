package test01;

public class AbcTest extends Thread {

	private String name;
	private Object pre;
	private Object self;
	
	public  AbcTest(String name,Object pre,Object self) {
		this.name = name;
		this.pre = pre;
		this.self = self;
	}

	@Override
	public void run() {
		int count =10;
		while(count>0) {
			synchronized(pre) {
				synchronized(self) {
					System.out.println(name);
					count--;
					self.notify();
				}
				try {
					pre.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	

}
