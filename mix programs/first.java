class demo{
	int a;
	int b;
	int addition()
	{
		int c= a+b;
		return c;
	}
	int subtraction(){
		int c=a-b;
		return c;
		
	}
	void set(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("Value of passing by main method : "+a+","+b);

	}
	
	public static void main(String args[]){
		int t;
		demo d = new demo();
		d.set(5,6);
		t=d.addition();
		System.out.println("addition of two valuses is:"+t);
		t=d. subtraction();
		System.out.println("subtraction of two valuses is :"+t);
		
	}
}