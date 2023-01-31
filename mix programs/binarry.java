class Binary{
	public static void main(String args[]){
		int i,j,l;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				l=i+j-1;
				if(l%2==1){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}
}