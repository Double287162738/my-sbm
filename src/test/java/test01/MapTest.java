package test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.sbm.service.SousouService;


public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("1", "一");
		map.put("2", "二");
		
//		for(Entry<String,String> entry : map.entrySet()) {
//			String string = entry.getValue();
//			System.out.println(string);
//		}
		
		for(String string  : map.keySet()) {
			System.out.println(string);
		}
	}
}
