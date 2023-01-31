class First{
	void firstMethod(int a , int b){
          System.out.println("this is a firstMethod in First class and a: "+ a +"\n"+"value of b :"+b);
	}
}
class Second extends First{
	void firstMethod(int a , int b){
          System.out.println("this is a firstMethod in Second class and a: "+ a +"\n"+"value of b :"+b);
	}
}
class Over{
	public static void main(String[] args) {
		Second second = new Second();
		second.firstMethod(4,5);
		
	}
}
