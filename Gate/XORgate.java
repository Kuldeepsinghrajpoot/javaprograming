class XORgate{
	public static void main(String[] args) {
		String s1="101010"; //Data 
		String s2="101010";//SPREADING CODE THIS 
		System.out.println("Data of spread : "+s1);
		System.out.println("ChipSequence :"+s2);
		System.out.print("After :");

		StringBuffer sb = new StringBuffer();
		for (int i=0;i<s2.length();i++ ) {
			sb.append(s2.charAt(i)^s1.charAt(i));
		}

       System.out.println(sb);

		
	}	
}