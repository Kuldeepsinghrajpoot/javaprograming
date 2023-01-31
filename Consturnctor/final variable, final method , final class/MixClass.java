class First{
	final int a =5;
	void nonFinalMethod(){
		int b =0;
		b= a+a;
		System.out.println(b);
	}
	final void finalMethod(){
		System.out.println(a);
	}
}
class MixClass{
	public static void main(String[] args) {
		First first=  new First();
		first.nonFinalMethod();
		first.finalMethod();
	}
}