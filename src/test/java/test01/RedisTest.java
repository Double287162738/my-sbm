package test01;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("qiao");
		System.out.println("连接成功");
		System.out.println("服务正在运行"+jedis.ping());
		Set<String> set = jedis.keys("*");
		Iterator<String >iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
