//Method overloading 
class drive{
	float x;
	float y;
	drive(float m ,float n){
		x=m;
		y=n;
	}
	drive(float m){
		x=y=m;
	}
	 float display(){
		return(x*y);
		//System.out.println(x*y);
	}
	
}
class Over{
	public static void main(String agrs[]){
		float g;
		overLoading ol= new overLoading(4,5);
		overLoading ol1 = new overLoading(69);
		g=ol.display();
		System.out.println("passing the value from ol object it is first object : "+g);
		g=ol1.display();
		System.out.println("Passing the value from ol1 object it is second object :"+g);
		
		
	}
}