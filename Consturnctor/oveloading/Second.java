class First{

	void methodFirst( int a , int b){
            System.out.println("value of a : "+a+"\n"+"value of b : "+b);
	}
	void methodSecond(int a){
		System.out.println("value of a in methodSecond : "+a);
	}
}
class Second{
	First first = new First();
	int m=5;
	int n=4;
	first.methodFirst(m,n);
	first.methodSecond(m);
}