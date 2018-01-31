package run;

public class Animal {
	public Animal(){
		
	}
   public Animal(Integer age,String name){
	     this.age=age;
	     this.name=name;
   }
   private Integer age;
   private String name;
   private String sex;
   public int money;
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public void setAge(Integer age) {
	this.age = age;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public void move(){
	System.out.println(name+"»á×ßÃ¨²½");
}
}
