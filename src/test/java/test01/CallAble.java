package test01;

import java.util.concurrent.Callable;

public class CallAble implements Callable<String> {

	private String waitTime;
	
	public CallAble(String time ) {
		this.waitTime=time;
	}
	@Override
	public String call() throws Exception {
		System.out.println(waitTime);
		return waitTime;
	}

}
