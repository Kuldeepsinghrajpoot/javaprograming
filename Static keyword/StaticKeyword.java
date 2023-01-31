class first{
	static int x=5;
	static int b=6;
	int a=5;
	void oneMethod(){
		
		System.out.println("Adding two value of oneMethod"+x+b);
	}
	static void twoMethod(){
         
       //  int b=10;
         System.out.println("Adding two value of twoMethod"+a);
	}
}
class StaticKeyword{
	public static void main(String[] args) {
		first fi= new first();
		fi.oneMethod();
		fi.twoMethod();
	}
}