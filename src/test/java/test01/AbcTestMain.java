package test01;

public class AbcTestMain {

	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();     
        Object b = new Object();     
        Object c = new Object();     
        
        AbcTest pa = new AbcTest("A", c, a);     
        AbcTest pb = new AbcTest("B", a, b);     
        AbcTest pc = new AbcTest("C", b, c);     


        new Thread(pa).start();
        Thread.sleep(1);  //确保按顺序A、B、C执行  
        new Thread(pb).start();  
        Thread.sleep(1);
        new Thread(pc).start();     
        Thread.sleep(1);  

	}

}
