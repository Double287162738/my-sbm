package test01;

public class ThreadTest {
	public static void main(String[] args) {
		RunnableTest t1 = new RunnableTest("线程1");
		t1.start();
		
		RunnableTest t2 = new RunnableTest("线程2");
		t2.start();
	}
}
