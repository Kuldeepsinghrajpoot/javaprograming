import java.util.Scanner;
class AddTwoMatrix{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i ,j;
		int a[][]= new int [5][5];
		int b[][]= new int [5][5];
		int c[][]= new int [5][5];
		int row1 , coloumn1;
		int row2 , coloumn2;
		System.out.println("Enter the first matrix row and coloumn");
		 row1= scan.nextInt();
		 coloumn1= scan.nextInt();	
		 System.out.println("Enter the second matrix row and coloumn");
		 row2= scan.nextInt();
		 coloumn2= scan.nextInt();	
		System.out.println("Enter the value of First Matrex");
		for(i=0;i<row1;i++){
          for(j=0;j<coloumn1;j++){
              a[i][j]= scan.nextInt();			  
		  }			
		}
		System.out.println("Enter the value of Second Matrex");
		for(i=0;i<row2;i++){
			for(j=0;j<coloumn2;j++){
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("First Matrex is :");
		for(i=0;i<row1;i++){
          for(j=0;j<coloumn1;j++){
              System.out.print(a[i][j]+"\t");	  
		  }	
          System.out.print("\n");		  
		}
		System.out.println("Second Matrex is :");
		for(i=0;i<row2;i++){
			for(j=0;j<coloumn2;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Addition of matrex is :");
		for(i=0;i<row1;i++){
			for(j=0;j<coloumn2;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}