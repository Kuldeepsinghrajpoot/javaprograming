//this is program of nesting means it is the function are called in fnction 
class Drive{
	int m;
	int n;
	Drive(int x , int y){
		m=x;
		n=y;
	 }
	int setData(){
		return(m*n);
	  }  
     	void display(){
			int function = setData();
			System.out.println("this is method acessing data by the setData : "+function);
		}
		
}
class  Nesting{
	public static void main(String[] args){
		Drive nest = new Drive(5,4);
		nest.display();
		
	}
}