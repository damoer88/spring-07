package _0208;

public class ErFenFa {//���ַ�
       public static int find(int arr[],int obj){
    	    int result=-1;//�����±�
    	    int min=0;//�����һ���±�Ϊmin
    	    int max=arr.length-1;//�������һ�������±�Ϊmax
    	    int mid=(min+max)/2;//�����м�������±�Ϊmid
    	    
    	    while(min<=max){
    	    	mid=(min+max)/2;
    	    	if(obj==arr[mid]){
    	    		result=mid;
    	    		break;
    	    	}else if(obj>arr[mid]){
    	    		min=mid+1;
    	    	}else{
    	    		max=mid-1;
    	    	}
    	    }
    	    return result;
       }
       public static void main(String[] args){
    		int arr[]=new int[100000];
    		for(int i=1;i<=100000;i++){
    			arr[i-1]=i;
    		}
    		int a=99999;
    		int result=find(arr,a);
    		System.out.println(result);
       }
}

