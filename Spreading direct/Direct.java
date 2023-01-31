class Direct{
	public static void main(String[] args) {
		int a=10100; //data
		int array[]= new int [12];
		int b=11,i=1;//code of spreading code for sending data sender to reciver;
		int c=0,c1=0,sum=0,reserve,reserve1;
		System.out.println("Data of spread : "+b);
		System.out.println("ChipSequence :"+a);
		 System.out.print("After :");
		 while(b!=0){

         reserve1=b%10;
			if (reserve1<0||reserve1>1) {
           	System.out.print(" please insert binray Number only ");
           	break;
           }
           	
 
		while(a!=0&i<13){
			 
			reserve=a%10;
			if (reserve<0||reserve>1) {
           	System.out.print(" please insert binray Number only ");
           	break;
           }
           if (reserve==0) {
           	reserve = -1;
          // 	System.out.println(reserve);
           }
            c=reserve*reserve1;
          // System.out.print(c);
           array[i]=c;
           i++;
            a=a/10;
          
      

		}
		System.out.print( reserve1);
		 b=b/10;
    }
           for (i=11;i>=1 ;i-- ) {
           	 System.out.print(array[i]);
           }
     //   System.out.println("sum of code here :"+sum);
	}
}