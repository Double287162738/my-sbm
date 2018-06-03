package userTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbm.service.UserService;


public class Test001 {

		ApplicationContext context = 
		          new ClassPathXmlApplicationContext(new String[] {"spring-scan.xml","spring-mybatis.xml"});
		
		UserService userService = (UserService)context.getBean("userService"); 
	@Test
	public void test001() {
		 System.out.println(userService.getUserByName("小明").getUserPhone());
	}
}
