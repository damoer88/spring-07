package lianxi;

import java.util.ArrayList;
import java.util.List;

public class maopao {

	public static void main(String[] args) {
        int a[]={84,21,494,311,484,11,87};
        /*√∞≈›≈≈–Ú*/
        /*for(int i=0;i<a.length;i++){
        	for(int j=0;j<a.length-1-i;j++){
        		if(a[j]>a[j+1]){
        			int t=a[j];
        			a[j]=a[j+1];
        			a[j+1]=t;
        		}
        	}  
        }
        for(int b:a){
        	System.out.print(b+" ");
        }*/
        /*—°‘Ò*/
        for(int i=0;i<a.length-1;i++){
        	for(int j=i+1;j<a.length;j++){
        		if(a[i]>a[j]){
        			int t=a[i];
        			a[i]=a[j];
        			a[j]=t;
        		}
        	}
        }
        for(int b:a){
        	System.out.print(b+" ");
        }
        List list=new ArrayList();
        list.add(8);
        System.out.println(list.size());
        list.get(0);
        System.out.println(list.get(0));
        list.add(9);
        System.out.println(list.size());
	}

}
