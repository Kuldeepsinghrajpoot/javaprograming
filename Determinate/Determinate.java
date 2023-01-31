class Determinate{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};

		for (int i=0;i<3;i++ ){
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	  
        System.out.println("New Array");

		for (int i=0;i<3;i++ ){
			for (int j=0;j<3;j++) {
				
				if (i==i) {
					continue;
				}
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}