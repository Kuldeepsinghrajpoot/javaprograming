import java.util.Scanner;
class Mat{
	Scanner scan = new Scanner(System.in);
		int a[][]= new int[3][3];
        int b[][]= new int[3][3];
        int c[][]= new int[3][3];
        int i,j,com1,r1,com2,r2;
	void matrix(){
        System.out.println("Enter the First matrix of coloumn and row");
           com1=scan.nextInt();
           r1=scan.nextInt();
        System.out.println("Enter the second matrix of coloumn and row");
           com2=scan.nextInt();
           r2=scan.nextInt();
           if ((com1==r2)&&(com2==r1)) {
           
           System.out.println("Enter the First matrix Value coloumn and row");
         for (i=0;i<com1;i++) {
			for (j=0;j<r1;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		 
           System.out.println("Enter the second matrix Value coloumn and row");
         for (i=0;i<com2;i++) {

			for (j=0;j<r2;j++) {
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("First matrix");
		for (i=0;i<com1;i++) {
			for (j=0;j<r1;j++) {
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("second  matrix");
        for( i=0;i<com2;i++) {
			for( j=0;j<r2;j++) {
				
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	else
	{
			System.out.println("Two matrix Multiplay not allow please insert valid Row and coloumn");
	}

}
	void multiplay(){
		System.out.println("Multiplay of two Array");
		for( i=0;i<com1;i++) {
			for( j=0;j<r2;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}			
			}
		}
		 for( i=0;i<com1;i++) {
			for( j=0;j<r2;j++) {
				
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}	

}
class Multi{
	public static void main(String[] args) {
		Mat m = new Mat();
		  m.matrix();
	     if((m.com1==m.r2)&&(m.com2==m.r1)) {
           m.multiplay();
         
        }
    }
}





output;-
java Multi
Enter the First matrix of coloumn and row
3
3
Enter the second matrix of coloumn and row
2
3
Two matrix Multiplay not allow please insert valid Row and coloumn

java Multi
Enter the First matrix of coloumn and row
2
3
Enter the second matrix of coloumn and row
3
2
Enter the First matrix Value coloumn and row
1
4
5
3
6
7
Enter the second matrix Value coloumn and row
8
9
6
5
2
4
First matrix
1       4       5

3       6       7

second  matrix
8       9

6       5

2       4

Multiplay of two Array
42      49

74      85
