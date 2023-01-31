class Private{
	private int a;
	private int b;

      void display(){
		  System.out.println("This is the a private class"+(a+b));
	  }	
}
class Public{
	public int a;
	public int b;
	void display1{
		System.out.println("This is a public class"+(a+b));
	}
}
class Protected{
	protected int a;
	protected int b;
	void display2(){
		System.out.println("This is a protected class"+(a+b));
	}
}
class Drive{
	public static void main(String args[]){
		Private pr = new Private();
		try{
		pr.a=5;
		pr.b=6;
		}catch(Exception e){
			System.out.println("Check on your program generate erron in this code");
		}
		
		
	}
}