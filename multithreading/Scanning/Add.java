import java.util.Scanner;
class Add{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = sc.nextInt();
		System.out.println("Enter second value:");
		int b= sc.nextInt();
	     System.out.println("Enter some operations[+,-,*,/]");
	     char c = sc.next().charAt(0);
		 int d;
		 switch(c){
			 case '+':
			 d=a+b;
			 System.out.println(a+""+""+c+""+""+b+"="+d);
			 break;
			  case '-':
			  d=a-b;
			 System.out.println(a+""+""+c+""+""+b+"="+d);
			 break;
			  case '*':
			  d=a*b;
			 System.out.println(a+""+""+c+""+""+b+"="+d);
			 break;
			  case '/':
			  d=a/b;
			 System.out.println(a+""+""+c+""+""+b+"="+d);
			 break;
		 }	 
	}
}