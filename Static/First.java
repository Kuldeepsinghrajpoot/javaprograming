class FirstMethod{
	static int a =5;
	FirstMethod(){
		System.out.println("This is a FirstMethod"+a);
	}
}
 class SecondMethod extends FirstMethod {

}
class First{
	public static void main(String[] args) {
		SecondMethod fs = new SecondMethod();

	}
}