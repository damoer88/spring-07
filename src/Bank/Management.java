package Bank;

import java.util.Scanner;

import Student.Student;
import Student.StudentsDate;

public class Management {
       Scanner scanner=new Scanner(System.in);
       public void menu(){
     	  while(true){
     		  System.out.println("�˻�����ϵͳ");
         	  System.out.println("1.����");
         	  System.out.println("2.��Ǯ");
         	  System.out.println("3.ȡǮ");
         	  System.out.println("4.ת��");
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
         	  default:System.out.println("����ָ�����");
         		  break; 
     	   }    	      
     	 }
       }
       
       public void add(){
     	  System.out.println("�����뿪��������");
     	  String name=scanner.nextLine();
     	  System.out.println("�����뿪���˵Ŀ���");
     	  String id=scanner.nextLine();
     	  System.out.println("�����뿪���˵Ĵ����");
     	  int money=scanner.nextInt();
     	  scanner.nextLine();
     	  MemberDate.map.put("b",new Member(name,id,money) );
     	  System.out.println("��ӳɹ�");
       }   
       public void save(){
     	  System.out.println("������Ҫ�����ʻ�");
     	  String name=scanner.nextLine();
     	  Member m1=MemberDate.map.get(name);
     	  if(m1==null){
     		  System.out.println("���ʻ�������");
     	  }else{
     		  System.out.println("��������Ҫ����Ľ��");
     		  int money=scanner.nextInt();
     		  scanner.nextLine();
     		  int first=m1.getMoney();
     		  first=first+money;
     		  m1.setMoney(first);
     		  MemberDate.map.put(name, m1);
     		  System.out.println("���ɹ�");
     	  }
       }
       
       public void out(){
     	  System.out.println("������Ҫȡ����ʻ�");
     	  String name=scanner.nextLine();
     	  Member m2=MemberDate.map.get(name);
     	  if(m2==null){
     		  System.out.println("���ʻ�������");
     	  }else{
     		  System.out.println("��������Ҫȡ���Ľ��");
     		  int money=scanner.nextInt();
     		  scanner.nextLine();
     		  int first=m2.getMoney();
     		  if(first>=money){
     			  first=first-money;
     			  m2.setMoney(first);
     			  MemberDate.map.put(name, m2);
     		  }else{
     			  System.out.println("���Ĵ����û����ô��Ǯ,������������");     		     
     		  }
     	  }
       }
       public void zhuan(){
     	  System.out.println("��������Ҫת�����ʻ�");
     	  String name=scanner.nextLine(); 
     	  Member m3=MemberDate.map.get(name);  
     	  if(m3==null){
     		  System.out.println("���ʻ�������");
     	  }else{
     		  System.out.println("��������Ҫת���Ľ��");
     		  int money=scanner.nextInt();
    		  scanner.nextLine();
    		  int first=m3.getMoney();
    		  if(first>=money){
    			  first=first-money;
    			  m3.setMoney(first);
    			  MemberDate.map.put(name, m3);
    		  }else{
    			  System.out.println("���Ĵ����û����ô��Ǯ,������������");     		     
    		  }
     	  }
       }
}
