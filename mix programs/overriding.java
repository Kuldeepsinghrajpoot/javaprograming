class Parent{
	public void display(){
		System.out.println("This is first class of parent ");
	}
}
class child extends Parent{
	@Override
	public void display(){
		System.out.println("This is second class of child");
	}
	
}
 
 class Drived{
	 public static void main(String args[]){
	 child ch= new child();
	 ch.display();
    }
 }