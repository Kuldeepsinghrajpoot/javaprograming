class LabbledLoop{
	public static void main(String[] args) {
		
		Loop1: for (int i=0;i<5;i++ ) {
			System.out.println(" ");
			if (i>10) {
				System.out.print("i");
				//break;
			}
			for (int j=0;j<i;j++) {
				//System.out.print(","+"i"+i+"j"+j);
				if (j==i) {
					continue Loop1;
				}
			}
			
		}
	}
}