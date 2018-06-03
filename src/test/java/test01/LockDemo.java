package test01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable{

	private Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		if(lock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName()+"获得lock");
			} finally {
				System.out.println(Thread.currentThread().getName()+"释放lock");
				lock.unlock();
			}
		}else {
			System.out.println("锁被占用，"+Thread.currentThread().getName()+"不要了");
		}
	}

}
