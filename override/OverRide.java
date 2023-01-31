class Super{
	int x;
	Super(int x){
		this.x=x;
	}
	void display(){
		System.out.print("This is super class"+x);
	}
}
class Sub extends Super{
	int y;
	Sub(int x,int y){
		super(x);
		this.y=y;
	}
	 void display(){
		 System.out.print("This is subclass"+y);
	 }
}
class OverrideTest{
	public static void main(String args[]){
	Sub sub = new Sub(10,20);
	sub.display();
	}
}