class First extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("This is First method of Thread"+i);
		}
	}
}
class Second extends Thread{
	
	public void run(){
		for(int j=0;j<5;j++){
		System.out.println("This is Second method of Thread"+j);
	 }
	}
}
class ThreadDemo{
	public static void main(String[] args){
		First   fi = new First();
		Second sec = new Second();

		fi.start();
		sec.start();
	}
}