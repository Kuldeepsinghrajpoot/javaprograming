import java.util.Scanner;
public class Binaray {
	static void binaray(){
	      Scanner sc = new Scanner(System.in);	
	           float a=0;
	           int value =0;
		     int d=0;
		     int i=1,e=0,l=1;
		    System.out.println("Enter the value for converting decimal to binary");
               value=sc.nextInt();
               int array[] = new int [value+1];
               a=(float)value ;
		while(i<array.length){
	        	  a=a/2;
	        	    float b=(int)a;
	        	    b=a-b;
	        	    a=a-b;
	        	if (b==0.5){
	        	          array[i]=1;
	        	}
	        	  if (a==0) {
	        	  	break;
	        	  }	  
	        	i++; 
	        	l+=1;
	        } 
	        System.out.print(" Binaray :");
	    for (i=l;i>0;i--)
	         {
	       System.out.print(" "+array[i]);         
	         } 
	    }  
	static void decimal(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the value for converting value binary to decimal ");
		int a=0,b,i=0;
		int sum=0;
		a=sc.nextInt();
		while(a!=0){
          b=a%10;
           if (b<0||b>1) {
           	System.out.print(" please insert binray Number only ");
           	break;
           }
            int n = (int)Math.pow(2,i);
            n=n*b;
            sum=n+sum;
            a=a/10;
            i++;
		}
		if (sum==0) {
		}else{System.out.print(sum);}
	}
	
	public static void main(String[] args){
		int value=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("choise");
        System.out.println("1.converting decimal to binary\n2.converting value binary to decimal ");
       // System.out.println("");
        value = sc.nextInt();
        switch(value){
        	case 1:
        	Binaray.binaray();
        	break;
        	case 2:
		Binaray.decimal();
		break;
           
         // default();
        }

		
    }
}
