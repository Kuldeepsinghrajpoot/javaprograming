import java.util.Scanner;
class DigitToEnglish {
	 public static void main(String args[]){
		 int a=6,c=0,d=0,b;
		 String A[]={"","one","two","three","four","five","six","seven","eight","nine"};
         String B[]={"ten","Eleven","twelve","thirteen","fouteen","fiften","sixteen","seventeen","eighteen","nineteen","twenty"};
		 while(a!=0){
			 b=a%10;
			 c++;
			 if(b==1){
				 System.out.print(c+""+b);
			 }
			 a=a/10;    		 
	     }
	 }
}
// if here 15 menas first value always one right yes right in case of two digit okey