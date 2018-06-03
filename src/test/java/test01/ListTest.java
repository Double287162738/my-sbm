package test01;

import java.util.ArrayList;
import java.util.List;

import com.sbm.util.StringToListUtils;


public class ListTest {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		String string = "2-7-8-3-1";
		result = StringToListUtils.changeToListIntDesc(string, "-");
		System.out.println(result);
	}
}
