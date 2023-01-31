class First extends Thread{
	public void run(){
	
		for(int i=0;i<15;i++){
		   System.out.println("This is a first method of run..."+i);
		   if(i==10){
			   stop();
		    }
	    } 
	}
}
class Second extends Thread {
	public void run(){
		for(int i=0;i<15;i++){
		   System.out.println("This is a second method of run......."+i);
		}
	}
}
 class StopDemo{
	 public static void main(String[] args){
		 First fi= new First();
		 Second sec= new Second();
		 fi.start();
		 sec.start();
	 }
 }