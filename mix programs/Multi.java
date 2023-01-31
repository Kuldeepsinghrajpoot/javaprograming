//passing the values i think it called multioveriding
class MultiOverride{
	int x;
	public int start(int x){
		this.x=x;
	}
	void display(){
		System.out.println("this is first class ");
	}
}
class access extends MultiOverride{
	int v;
	void Ac(int x ,int y){
		public int start(x);
		
	}
	void display(){
		System.out.println("this is second class ");
	}
}
class run{
	public static void main(String args[]){
		access as =new access();
		as.Ac(5,6);
		as.display();
	}
}