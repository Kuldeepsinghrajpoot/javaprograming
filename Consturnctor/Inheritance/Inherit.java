class First{

	void fisrtMethod(){
		System.out.println("This is a fisrtMethod in First class");
	}

}
class Second extends First{
	void secondMethod(){
		System.out.println("This is a secondMethod in Second class");
	}
}
class Inherit{
	public static void main(String[] args) {
		Second second = new Second();
		second.fisrtMethod();
		second.secondMethod();
	}
}

output
javac Inherit.java
java Inherit
This is a fisrtMethod in First class
This is a secondMethod in Second class