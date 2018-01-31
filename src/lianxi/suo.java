package lianxi;

public class suo {
    
	public class Thread1 implements Runnable{
	  public synchronized void shuhu(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"µÚ"+i+"¸ö");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	  }
		public void run(){
								
		} 
	}
}
         
	


