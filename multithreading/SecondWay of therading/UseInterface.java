class First implements Runnable{
	public void run(){
		for (int i=0;i<5;i++ ) {
	  System.out.println("This is a first Thread"+i);
	  }
	}
}
class Second implements Runnable{
	public void run(){
		System.out.println("This is a second Thread");
	}
}
class UseInterface{
	public static void main(String[] args) {
		First fi = new First();
		Second sec = new Second();

		Thread th= new Thread(fi);
		Thread  th2= new Thread(sec);
		th.start();
		th2.start();
	}
}