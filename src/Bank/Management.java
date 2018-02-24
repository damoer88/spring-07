package Bank;

import java.util.Scanner;

import Student.Student;
import Student.StudentsDate;

public class Management {
       Scanner scanner=new Scanner(System.in);
       public void menu(){
     	  while(true){
     		  System.out.println("账户管理系统");
         	  System.out.println("1.开户");
         	  System.out.println("2.存钱");
         	  System.out.println("3.取钱");
         	  System.out.println("4.转账");
         	  int index=scanner.nextInt();
         	  scanner.nextLine();
         	  switch(index){
         	  case 1:
         		  add();
         		  break;
         	  case 2:
         		  save();
         		  break;
         	  case 3:
         		  out();
         		  break;
         	  case 4:
         		  zhuan();
         		  break;
         	  default:System.out.println("输入指令错误");
         		  break; 
     	   }    	      
     	 }
       }
       
       public void add(){
     	  System.out.println("请输入开户人姓名");
     	  String name=scanner.nextLine();
     	  System.out.println("请输入开户人的卡号");
     	  String id=scanner.nextLine();
     	  System.out.println("请输入开户人的存款金额");
     	  int money=scanner.nextInt();
     	  scanner.nextLine();
     	  MemberDate.map.put("b",new Member(name,id,money) );
     	  System.out.println("添加成功");
       }   
       public void save(){
     	  System.out.println("输入所要存款的帐户");
     	  String name=scanner.nextLine();
     	  Member m1=MemberDate.map.get(name);
     	  if(m1==null){
     		  System.out.println("该帐户不存在");
     	  }else{
     		  System.out.println("请输入所要存入的金额");
     		  int money=scanner.nextInt();
     		  scanner.nextLine();
     		  int first=m1.getMoney();
     		  first=first+money;
     		  m1.setMoney(first);
     		  MemberDate.map.put(name, m1);
     		  System.out.println("存款成功");
     	  }
       }
       
       public void out(){
     	  System.out.println("输入所要取款的帐户");
     	  String name=scanner.nextLine();
     	  Member m2=MemberDate.map.get(name);
     	  if(m2==null){
     		  System.out.println("该帐户不存在");
     	  }else{
     		  System.out.println("请输入所要取出的金额");
     		  int money=scanner.nextInt();
     		  scanner.nextLine();
     		  int first=m2.getMoney();
     		  if(first>=money){
     			  first=first-money;
     			  m2.setMoney(first);
     			  MemberDate.map.put(name, m2);
     		  }else{
     			  System.out.println("您的存款中没有这么多钱,请重新输入金额");     		     
     		  }
     	  }
       }
       public void zhuan(){
     	  System.out.println("请输入所要转出的帐户");
     	  String name=scanner.nextLine(); 
     	  Member m3=MemberDate.map.get(name);  
     	  if(m3==null){
     		  System.out.println("该帐户不存在");
     	  }else{
     		  System.out.println("请输入所要转出的金额");
     		  int money=scanner.nextInt();
    		  scanner.nextLine();
    		  int first=m3.getMoney();
    		  if(first>=money){
    			  first=first-money;
    			  m3.setMoney(first);
    			  MemberDate.map.put(name, m3);
    		  }else{
    			  System.out.println("您的存款中没有这么多钱,请重新输入金额");     		     
    		  }
     	  }
       }
}
