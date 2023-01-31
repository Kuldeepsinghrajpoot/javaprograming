class trangle{
	public static void main(String args[]){
		int i;
		int j;
		int a;
		for(i=0;i<=6;i++){
			for(j=0;j<=i;j++)
			{
				a=j+i;
			if(a%2==0){
				System.out.print("0");				
			 }
			 else if(a%2==1){
				System.out.print("1");				
			 }
		   }
		  System.out.print("\n");
		}
	}
}