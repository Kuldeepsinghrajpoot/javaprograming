/*
* abstract method is used for the only define the Method not body and than this abstract
Method are use in any class it is called abstract method and class it use two pare not use 
single pare.

*here useing the public acces modifier*/
abstract class Super{
	public abstract void fistMethod();
	public abstract void secondMethod();
	
}
class AccesData extends Super{
public void fistMethod(){
	System.out.println("This is a first Method of abstract ");
}
public void secondMethod(){
	System.out.println("This is a secondMethod of abstract");
}
}
class Abstract{
	public static void main(String args[]){
		AccesData sup = new AccesData();
		sup.fistMethod();
		sup.secondMethod();
	}
}