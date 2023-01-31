class First{

	static int a=5;
	int b=5;
	 static void firstMethod(){
	 	System.out.println("This is a static method and  non static variable : "+b);
	 }
	 void secondMethod(){
	 	System.out.println("This is a non Static method and static variable : "+a);
	 }
}

class StaticMember{
	public static void main(String[] args) {
		First first = new First();
		first.firstMethod();
		first.secondMethod();
	}
}

output;-
javac StaticMember.java
StaticMember.java: error: non-static variable b cannot be referenced from a static context
                System.out.println("This is a static method and  non static variable : "+b);
                                                                                         ^
1 error