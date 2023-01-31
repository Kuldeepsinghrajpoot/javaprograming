class MixClass{
	final int a =5;
	void nonFinalMethod(){
	
		a= a+a;
		System.out.println(a);
	}
	final void finalMethod(){
		System.out.println(a);
	}
}
class First{
	public static void main(String[] args) {
		MixClass first=  new MixClass();
		first.nonFinalMethod();
		first.finalMethod();
	}
}

javac First.java
First.java: error: cannot assign a value to final variable a
                a= a+a;
                ^
1 error