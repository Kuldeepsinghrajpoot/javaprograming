class First extends Thread{
	public void run(){
		for(int i=1;i<20;i++){
			System.out.println("First run"+i);
		}
		Shared.increment();
	}
}
 class second extends Thread{
	 public void run(){
		 for(int i=1;i<20;i++){
			System.out.println("Secnd run"+i);
		}
		Shared.dicremented();
	 }
 }
 class Seconds{
	 public static void main(String args[]){
		 First fi= new First();
		 second se = new second();
		 fi.start();
		 se.start();
		 
	 }
	 
 }