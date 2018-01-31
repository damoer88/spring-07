package lianxi;

public class Test {
	public static void main(String[] args){
		Cat a=new Cat();
		/*a.setName("abc");
		a.move();
		a.same(6, 8);
		a.same("78", 4);
		a.same(8, "65");
		System.out.println();*/
		a.setName("mmmm");
		//System.out.println(a.getName());
		a.money=100;
		//System.out.println(a.money);
        a.move();
        Integer b=128;
        Integer c=128;
        System.out.println(b.intValue()==c.intValue());
	}
}
