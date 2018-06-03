package test01;

import com.sbm.pojo.User;

public class ReflectTest {

	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = User.class;
		System.out.println("类名.class:"+clazz);
		
		User user = new User();
		Class clazz1 = user.getClass();
		System.out.println("getClass:"+clazz1);
		
		Class clazz2 = Class.forName("com.sbm.pojo.User");
		System.out.println("Class.forName:"+clazz2);
	}
}
