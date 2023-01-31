// Here using only two class so it is called singleInheritance
class SingleInheritance{
	 int height;
	 int width;
	 
	 SingleInheritance(int x ,int y){
		height=x;
		width=y;
		
	 }
	 int area(){
		 return(height*width);
		 this(SingleInheritance);
		 //	System.out.println("value of x by this keyword"+x);
		 
	 }
	 
}
 class touch extends SingleInheritance{
	 int breadth;
	 
	touch(int y ,int x, int z)
	 {
		 super(x,y);
		 breadth=z;
	 }
	 int valum()
	 {
		return(height*width*breadth); 
	 }
  }
 
 
 class result{
	  public static void main(String args[]){
		  touch th= new touch(7,8,9);
		  
		  int a=th.area();
		  int v=th.valum();
		 // th.width=5;
		  System.out.println("pasing the value by main and than extends than the area is :"+a);
		  System.out.println("passing  the by the main method than resutl is means valum :"+v);
		  
	  }
 }