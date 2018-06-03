package test01;

import java.util.Calendar;
import java.util.Date;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.sbm.util.GetUuidUtils;
import com.sbm.util.NowTimeUtils;

public class DateTest {
public static void main(String[] args) {
//	Calendar calendar = Calendar.getInstance();
//	System.out.println(calendar.get(Calendar.YEAR));
//	System.out.println(calendar.get(Calendar.MONTH)+1);
//	System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//	System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//	System.out.println(calendar.get(Calendar.MINUTE));
//	System.out.println(calendar.get(Calendar.SECOND));
//	System.out.println(GetUuidUtils.getUUID());
//	System.out.println(Calendar.YEAR);
//	System.out.println(GetUuidUtils.getUUID());
	System.out.println(NowTimeUtils.getYmd());
	System.out.println("0"+"22");
}
}
