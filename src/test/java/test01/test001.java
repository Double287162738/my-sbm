package test01;

import com.sbm.dao.UserMapper;
import com.sbm.pojo.User;
import com.sbm.pojo.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-scan.xml"})
public class test001 {

//	private ApplicationContext context = new ClassPathXmlApplicationContext("spring-scan.xml","spring-mybatis.xml");
//	UserMapper userMapper = (UserMapper) context.getBean("userMapper");
	@Resource
	private UserMapper userMapper;
	@Test
	public void test0001() {
		UserExample userExample = new UserExample();
		
		UserExample.Criteria criteria1 =userExample.createCriteria();
		criteria1.andUserIdEqualTo("1");
		criteria1.andUserNameEqualTo("1");
		
		
		List<User> list = new ArrayList<>();
		list = userMapper.selectByExample(userExample);
		System.out.println(list.get(0).getUserId()+list.get(0).getUserSex());
	}
	

	
	
	
}




