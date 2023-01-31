class First implements Runnable{
	public void run(){
		for (int i=0;i<5;i++){
		System.out.println("This is a first method of run......"+i);
          try{
          	 Thread.sleep(200);
          }catch(Exception e){
          	System.out.println("Error generat by sleep"+e);
          }
        }
	}
}
class Second implements Runnable{
	public void run(){
		System.out.println("This is a Second method of run");

	}
}

class Sleep{
	public static void main(String[] args) {
		First fi = new First();
		Second sec = new Second();
		Thread thread = new Thread(fi);
		Thread threadsec = new Thread(sec);
	thread.run();
	threadsec.run();
	}
}