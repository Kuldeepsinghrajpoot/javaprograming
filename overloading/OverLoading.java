//Method overloading 
class overLoading{
	float x;
	float y;
	overLoading(float m ,float n){
		x=m;
		y=n;
	 	
	}
	overLoading(float m){
		x=y=m;
	}
	 float display(){
		return(x*y);
		//System.out.println(x*y);
	}
	
}
class drive{
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