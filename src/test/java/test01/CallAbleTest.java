package test01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallAbleTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("action");
		CallAble call1 = new CallAble("call1");
		CallAble call2 = new CallAble("call2");
		
		FutureTask<String> futureTask1 = new FutureTask<>(call1);
		FutureTask<String> futureTesk2 = new FutureTask<>(call2);
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(futureTask1);
		executorService.execute(futureTesk2);
		while(true) {
			if(futureTask1.isDone()&&futureTesk2.isDone()) {
				System.out.println("all fininshed");
				executorService.shutdown();
				return;
					
			}
			if(!futureTask1.isDone()) {
				System.out.println("task1 is not finished");
				System.out.println("task1:"+futureTask1.get());
			}
		}
		
		
	}
}
