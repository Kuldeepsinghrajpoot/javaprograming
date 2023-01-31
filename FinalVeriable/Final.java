final class first{ // here using the final keyword than i am not extends class in b
	int a;
	int b;
	final int c=5;
	int Methods(int x, int y){
		a=x;
		b=y;
		//c=y; // i am inserting the final value variable but final menas it is fixed and not change the value of c.
		return a+b;
	}
}
class second extends first{
	int methods(int x, int y){
		a=x;
		b=y;
		return a+b;
		
	} 
}
class drive {
	public static void main(String args[]){
		int result;
	second sec = new second();
	result=sec.Methods(5,5);
	
	//@ here  i am definin the two type of methods passing the value directly and passing the value on directly.
	//System.out.println("This is a first methods of the first class and value  is :"+sec.Methods(5,5));
	//System.out.println("This is a second methods of the second class and value is :"+sec.methods(6,5));
	System.out.println("This is a first methods of the first class and value  is :"+result);
	result=sec.methods(6,5);
	System.out.println("This is a second methods of the second class and value is :"+result);
  }
}