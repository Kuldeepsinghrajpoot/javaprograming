final class FirstMethod{
	final int a=5;
	FirstMethod(){
     System.out.println("this is final value"+a);

	}
}


class First{
	public static void main(String[] args) {
		FirstMethod fm = new FirstMethod();

	}
}