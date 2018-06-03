package test01;


public class AbstractClassTest2 extends AbstractClassTest  {

	@Override
	void method1() {
		System.out.println("抽象方法1被实现");
		
	}

	@Override
	void method2() {
		System.out.println("抽象方法2被实现");		
	}
	
	public static void main(String[] args) {
		AbstractClassTest a = new AbstractClassTest2();
 	}
	
}
