package test01;

public class Class1 {
	String name = "tom1";
	public void test001() {
		System.out.println("父test001");
	}
	Class1(){
		
	}
	Class1(String name){
		System.out.println("Class1.name="+name);
	}
}
