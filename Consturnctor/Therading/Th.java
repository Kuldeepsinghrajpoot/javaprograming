class First extends Thread{
	public void run(){
      System.out.println("This is first Thread");
	}
}
class Second extends Thread {
	public void run(){
		System.out.println("This is Second Thread");
	}
}
class Th{
	public static void main(String[] args) {
		First f = new First();
		Second s = new Second();
		f.start();
		s.start();
	}
}