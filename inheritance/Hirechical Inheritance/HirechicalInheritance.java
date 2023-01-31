class fist{
	public int a;
	public int b;
	int addition(){
		return a+b;
	}
}
class second extends fist{
  	 
	 int sub(){
		 //System.out.println(a-b);
		return a-b;
	 }
}

class third extends second{
	int multi(){
		return a*b;
	}
}
class hirechial{
	public static void main(Sring args[]){
	int x;
	third th = new third();
	th.a=5;
	th.b=6;
	x=th.addition();
	System.out.println("addition is of a and b is :"+x);
	x=th.sub();
	System.out.println("Substraction of a and b is :"+x);
	x=th.multi();
	System.out.println("Multiply of a and b is :"+x);
  }
}