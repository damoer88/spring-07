package Student;

import java.util.Map;
import java.util.Scanner;

public class Management {
      Scanner scanner=new Scanner(System.in);
      public void menu(){
    	  while(true){
    		  System.out.println("����ѧ��");
        	  System.out.println("1.���ѧ��");
        	  System.out.println("2.ɾ��ѧ��");
        	  System.out.println("3.�޸�ѧ����Ϣ");
        	  System.out.println("4.����ѧ��");
        	  int index=scanner.nextInt();
        	  scanner.nextLine();
        	  switch(index){
        	  case 1:
        		  add();
        		  break;
        	  case 2:
        		  remove();
        		  break;
        	  case 3:
        		  update();
        		  break;
        	  case 4:
        		  find();
        		  break;
        	  default:System.out.println("����ָ�����");
        		  break; 
    	   }    	      
    	 }
      }
      
      public void add(){
    	  System.out.println("����ѧ��ѧ��");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  System.out.println("����ѧ������");
    	  String name=scanner.nextLine();
    	  System.out.println("����ѧ���Ա�");
    	  String sex=scanner.nextLine();
    	  StudentsDate.map.put(num,new Student(num,name,sex) );
    	  System.out.println("��ӳɹ�");
      }   
      public void remove(){
    	  System.out.println("������Ҫɾ����ѧ��ѧ��");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("��ѧ��������");
    	  }else{
    		  StudentsDate.map.remove(num);
    		  System.out.println("ɾ���ɹ�");
    	  }
      }
      
      public void update(){
    	  System.out.println("������Ҫ�޸ĵ�ѧ��ѧ��");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("��ѧ��������");
    	  }else{
    		  System.out.println("�������޸ĺ��ѧ��");
    		  int id=scanner.nextInt();
    		  scanner.nextLine();
    		  System.out.println("�������޸ĺ������");
    		  String name=scanner.nextLine();
    		  System.out.println("�������޸ĺ���Ա�");
    		  String sex=scanner.nextLine();
    		  Student s2=new Student(id, name, sex);
    		  StudentsDate.map.put(id, s2);
    		  System.out.println("�޸ĳɹ�");
    	  }
      }
      public void find(){
    	  System.out.println("��������Ҫ��ѯ��ѧ��ѧ��");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("��ѧ��������");
    	  }else{
    		  StudentsDate.map.get(num);
    		  System.out.println(s1);
    	  }
      }
    
}
