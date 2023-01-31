class first{
	int a;
	int b;
	int function(int x, int y){
		a=x;
		b=y;
		return a+b;
	}
}
class second extends first{
	
	int funSecond( int m){
		a=m;
		return m+90;
	}
     protected void finalize(){
		System.out.println("----------End this progarm----------");
	}
}

class Finalize{
	public static void main(String args[]){
	int d;
	second sec= new second();
	d=sec.function(5,5);
	System.out.println("This is a first method of first class"+d);
	d=sec.funSecond(9);
	System.out.println("This is a First method of second class "+d);
	sec=null;
    System.gc();
	}
}

