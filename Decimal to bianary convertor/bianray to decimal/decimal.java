import java.util.Scanner;
class decimal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for converting value binary to decimal "); 
		int a=0,b=0,i=0;
		int sum=0;
		a=sc.nextInt();
		while(a!=0){
           b=a%10;
           if (b<0||b>1) {
           	System.out.print(" please insert binray Number only ");
           	break;
           }
           if (i<2) {
           	int n = (int)Math.pow(2,i);
            n=n*b;
            sum=n+sum;
            //System.out.print(sum);
            System.out.print("\ni - "+i);
            a=a/10;
             if(i!=1) {
             	//System.out.print(i);
             	i=0;
             	sum=0;
             	//System.out.println(i);
             }
              i++; 
           }
           
            
		}
		if(sum==0) {
			
		}else{
		
	     }
	}
}