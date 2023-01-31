class SuperClass{
	int a;
	int b;
	
}
class drive extends SuperClass{
	int  display(){
           return a+b;
	}
}

class drive2 extends SuperClass{
	int printdisplay(){
		return a+b;
	}
}
class hirechical{
	public static void main(String args[]){
		drive2  hi = new drive2 ();
		int dis;
		hi.a=5;
		hi.b=6;
		//dis=hi.display();
		//System.out.println(dis);
		dis=hi.printdisplay();
		System.out.println(dis);
	}
}