package test01;


public class Class2 extends Class1{
	
	String name1 = "tom2";
	public void test002() {
		System.out.println("子类test001");
	}
	Class2(){
		System.out.println("Class2无参构造方法");
	}
	
	Class2(String name){
		System.out.println("Class2.name="+name);
	}
	Class2(String name,String sex){
		System.out.println("Class2.name="+name+",Class2.sex="+sex);
	}

	public static void main(String[] args) {
		Class1 c = new Class2();
		c.test001();
	}
}
