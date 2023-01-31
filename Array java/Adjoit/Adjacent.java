class Adjacent{
	public static void main(String[] args) {
		String a[][]= {{"a11","a12","a13"},{"a21","a22","a23"},{"a31","a32","a33"}};
				  	 	int row=0,k=0,i=0,j=0,c=0,b=0,d=0,l=0;
		System.out.println("----------------------------------------------------------");
     do{
		  for (i=c;i<3;i++){
			  for (j=d;j<3;j++){
				System.out.print(""+i+j+"\t");	
			   }
			  System.out.println("\n");	  
		  }   
		  	if (c<2) {
		  		c++;
		  		d=1;
		  		b++;
		  		if (b<2) {
		  			c=1;
		  			d=1;
		  			b=0;
		  			l++;
		  			System.out.println("this is second of the array");
		  		}
		  	}
		  	else if (l==1) {
		  				c=0;
		  				d=1;
		  				System.out.println("this is third of the array");
		  			}


		  if (i==i) {
	     		System.out.println("-----------------------------------------------------------");
	     	}
            k++;
	   } while(k<6);{
	   	      if (k==3) {
	   	      	System.out.println("value of k is"+k);
	   	      }
	      }

	      for (i=0;i<3;i++){
			  for (j=0;j<3;j++){
				System.out.print(""+i+j+"\t");
			   }
			  System.out.println("\n");	
		}
		  System.out.println("----------------------------------------------------------");
	}
}
