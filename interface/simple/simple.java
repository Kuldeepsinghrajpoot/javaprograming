/*// it is used for the first time inilization of the value and last time exection any class and use and like define
 using in c laguage  and use any where and use this value and method */

interface item{
	int a=5;
	int b=6;
}
interface item2{
	int c=5;
	int d=6;
}
class first implements item,item2{
	void sum(int n , int m){
		
	 System.out.println("Additon of two value passing the vlaue by main method : " +(n+m));
	 System.out.println("Additon of two value inilizationin interface item : " +(n+m));
	 System.out.println("Additon of two value inilizationin interface item : " +(d+c));
	}
}
class simple{
	public static void main(String[] args) {
		first fis = new first();
		fis.sum(5,6);
	}
}