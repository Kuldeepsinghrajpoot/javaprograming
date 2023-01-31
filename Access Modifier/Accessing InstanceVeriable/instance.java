class first{
	int a;
	int b;
	int display(){
		return a+b;
	}
}
class instance{
	public static void main(String[] args){
		first fi = new first();
		fi.a=6;
		fi.b=7;
		System.out.println("Accessing the veriable in the first class"+fi.display());
	}
}