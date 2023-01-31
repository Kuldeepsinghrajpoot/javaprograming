class ArrayList{
	public static void main(String[] args) {
		 int Array[][] ={{1,2,3,4,5},{6,7,8,9,10},{12,13,14,15,16},{17,18,19,20,21},{22,23,24,25,2}};
		 for (int a=0;a<5 ;a++) {
		 	for (int b=0;b<5 ;b++ ) {
		 		
		 		System.out.print("\t"+Array[a][b]);
		 	}
		  	System.out.print("\n");
		  } 

		  System.out.println(Array[2][2]);
	}
}