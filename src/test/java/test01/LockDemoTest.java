package test01;

public class LockDemoTest {
	
	public static void main(String[] args) {
		LockDemo lockDemo = new LockDemo();
		new Thread(lockDemo,"1").start();
		new Thread(lockDemo,"2").start();
	}

}
