class Shared{
	static int x=100;
	
	synchronized static void increment(){
		 for(int i=1;i<50;i++){
			x++;
			System.out.println("this is icrement"+x);
			try{
				Thread.sleep(200);
				
			}catch(Exception e){
				System.out.println("Generate error"+e);
			}
		}
	}
	synchronized static void dicremented(){
		 for(int i=1;i<50;i++){
			x--;
			System.out.println("dicremented"+x);
			try{
				Thread.sleep(200);
				
			}catch(Exception e){
				System.out.println("Generate error"+e);
			}
		}
	}
}