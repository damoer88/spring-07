package _0208;

public class ErFenFa {//二分法
       public static int find(int arr[],int obj){
    	    int result=-1;//返回下标
    	    int min=0;//数组第一个下标为min
    	    int max=arr.length-1;//数组最后一个数的下标为max
    	    int mid=(min+max)/2;//数组中间的数的下标为mid
    	    
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

