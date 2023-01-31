import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i ,j;
		int a[][] = new int [5][5];
		int b[][] = new int [5][5];
		int c[][] = new int [5][5];
		for(i=0;i<3;i++){
          for(j=0;j<3;j++){
             
              a[i][j]= scan.nextInt();			  
		  }			
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("First Matrex is :");
		for(i=0;i<3;i++){
          for(j=0;j<3;j++){
             
              System.out.print(a[i][j]);	  
		  }	
          System.out.print("\n");		  
		}
		System.out.println("Second Matrex is :");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(b[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Addition of matrex is :");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}
}