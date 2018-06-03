package test01;

public class RunnableTest implements Runnable {

	private Thread thread;
	private String threadName;
	
	RunnableTest(String name){
		this.threadName = name;
		System.out.println("创建线程："+name);
	}
	
	@Override
	public void run() {
		System.out.println("运行线程："+threadName);
		try {
			for(int i=4;i>=1;i--) {
				System.out.println("线程："+threadName+"-"+i);
				Thread.sleep(50);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("停止线程："+threadName);
	}
	
	public void start() {
		System.out.println("线程开始："+threadName);
		if(thread==null) {
			thread = new Thread(this,threadName);
			thread.start();
		}
	}

}
