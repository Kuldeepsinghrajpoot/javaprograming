class Private{
	private int a;
	private int b;

      void display(){
		  System.out.println("This is the a private class"+(a+b));
	  }	
}
class Public{
	int a;
    int b;
	void display1(){
		System.out.println("This is a public class"+(a+b));
		//return a+b;
	}
}
class Protected{
	protected int a;
	protected int b;
	void display2(){
		System.out.println("This is a protected class"+(a+b));
	}
}
class drive{
	public static void main(String args[]){
		
		int v;
			Protected pr = new Protected();
		pr.a=5;
		pr.b=6;
		//v=pr.display2();
		//System.out.println(v);
		
		//System.out.println("This is the Public class "+pr.display1());
		
	}
}