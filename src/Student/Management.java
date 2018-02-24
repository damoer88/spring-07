package Student;

import java.util.Map;
import java.util.Scanner;

public class Management {
      Scanner scanner=new Scanner(System.in);
      public void menu(){
    	  while(true){
    		  System.out.println("管理学生");
        	  System.out.println("1.添加学生");
        	  System.out.println("2.删除学生");
        	  System.out.println("3.修改学生信息");
        	  System.out.println("4.查找学生");
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
        	  default:System.out.println("输入指令错误");
        		  break; 
    	   }    	      
    	 }
      }
      
      public void add(){
    	  System.out.println("输入学生学号");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  System.out.println("输入学生姓名");
    	  String name=scanner.nextLine();
    	  System.out.println("输入学生性别");
    	  String sex=scanner.nextLine();
    	  StudentsDate.map.put(num,new Student(num,name,sex) );
    	  System.out.println("添加成功");
      }   
      public void remove(){
    	  System.out.println("输入所要删除的学生学号");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("该学生不存在");
    	  }else{
    		  StudentsDate.map.remove(num);
    		  System.out.println("删除成功");
    	  }
      }
      
      public void update(){
    	  System.out.println("输入所要修改的学生学号");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("该学生不存在");
    	  }else{
    		  System.out.println("请输入修改后的学号");
    		  int id=scanner.nextInt();
    		  scanner.nextLine();
    		  System.out.println("请输入修改后的姓名");
    		  String name=scanner.nextLine();
    		  System.out.println("请输入修改后的性别");
    		  String sex=scanner.nextLine();
    		  Student s2=new Student(id, name, sex);
    		  StudentsDate.map.put(id, s2);
    		  System.out.println("修改成功");
    	  }
      }
      public void find(){
    	  System.out.println("请输入你要查询的学生学号");
    	  int num=scanner.nextInt();
    	  scanner.nextLine();
    	  Student s1=StudentsDate.map.get(num);
    	  if(s1==null){
    		  System.out.println("该学生不存在");
    	  }else{
    		  StudentsDate.map.get(num);
    		  System.out.println(s1);
    	  }
      }
    
}
