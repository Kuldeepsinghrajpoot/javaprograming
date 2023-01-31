class A extends Thread{
	int x;
	public void run(int a){
		x=a;
		System.out.println("x :"+x);
	}
}
class B extends Thread{
	int y;
	public void run(int b){
		 y=b;
		System.out.println("y :"+y);
	}
}
class Add{
	public static void main(String args[]){
		 A aa = new A();
		 B bb = new B();
	     aa.x=5;
		 bb.y=6;
		 aa.start();
		 bb.start();
	}
}