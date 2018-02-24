package lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Riqi {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Date date=new Date();
        /*System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());*/
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=sdf.format(date);
        System.out.println(str);
        Date d2=sdf.parse("2018-01-13 21:15:12");
        System.out.println(d2);*/
        int a[]={45,21,6,85,12,31,54};
        Arrays.sort(a);
        int b[]=Arrays.copyOf(a, 12);
        System.out.println(Arrays.toString(b));
	}

}
