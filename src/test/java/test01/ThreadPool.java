package test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;


public class ThreadPool {
	
	@Test
	public void testThreadPool() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
		for(int i=0;i<10000;i++) {
			newThread n = new newThread(i);
			fixedThreadPool.execute(n);
		}
		fixedThreadPool.shutdown();
		while(!fixedThreadPool.isTerminated()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

public class newThread implements Runnable {

	private Integer i;
	public newThread(Integer i) {
		this.i= i;
	}
	@Override
	public void run() {
		System.out.println("===:"+i);
	}
	
}


}
