class a{
 void first(int x,int  n){
	 System.out.println("This is first"+(x+n));
 }
}
class b extends a{
	void first(int x){
		System.out.println("This is second"+x);
		super(x);
	}
}
class c extends b{
	public static void main(String args[]){
	c ob = new c();
    ob.first(5,6);
  }
}

/* Bescause it is botton up approach par work karta h */