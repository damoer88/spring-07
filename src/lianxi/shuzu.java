package lianxi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class shuzu {

	public static void main(String[] args) {
		/*Set set=new HashSet();
		(HashSet=Set)
		set.add("5");
		set.add("8");
		set.add("6");
		set.add("r");
		set.remove("6");
		for(Object obj:set){
			System.out.println(obj);
		}*/
       /* HashMap map=new HashMap();
        map.put(5,551);
        map.put(2,88);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(50));*/
		/*String a="a";
		a="b";
		method(a);
		System.out.println(a);*/
		/*String a=new String("a");
		String b=new String("a");
		System.out.println(a.equals(b));*/
		/*int i=1;
		String c=String.valueOf(i);
		System.out.println(c+2);*/
		StringBuilder builder=new StringBuilder("4");
		builder.append("a");
		builder.append(8);
		System.out.println(builder);
		System.out.println(builder.substring(0, 2));/*左闭右开*/
		String a=new String("5");
		a+="i";
		a+="6";
		a+="8";
		a+="8";
		String b=a.replace("6","3");
		String c=a.replaceAll("8", "t");
		/*System.out.println(a.substring(1, 3));/*左闭右开*/
		/*System.out.println(a.substring(2));/*截取到结尾*/
		System.out.println(b);
		System.out.println(c);
	}

	private static void method(String a) {
		a="abc";
	}

}
