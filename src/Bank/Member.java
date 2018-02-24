package Bank;

public class Member {
      private String  id;
      private String name;
      private int money;
	public Member(String name, String id, int money) {
		// TODO Auto-generated constructor stub
	}
		public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
    public String toString(){
    	return"¿¨ºÅ:"+id+" ÐÕÃû:"+name+" ´æ¿î:"+money;
    }
}
