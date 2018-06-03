package test01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.SimpleFormatter;

import com.alibaba.fastjson.JSON;

public class IfAndElseIfTest {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("1234567890");
	list.add("werty");
	list.add("dfghj67890");
	System.out.println(JSON.toJSONString(list));
	}
}
