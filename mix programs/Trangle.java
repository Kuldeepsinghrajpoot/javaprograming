class Trangle{
	public static void main(String args[]){
		int i=1,j=1, n=0;
		while(n<10){
		for(j=1;j<=i;j++){
			  
		       System.out.print(++n); 
			}
			System.out.print("\n");
			if(j==7){
			i++;
			System.out.print("This is the second of the loop and break"+i+n);
			//break;
			
			}
			
			
		}
	}
}