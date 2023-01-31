class First{

  int i=0,j=0,k=0;
	synchronized void display(){
		System.out.println("Show result of adding values");
       if (i==0) {

       	  try{
                wait();
       	    }catch(Exception e){
       	    	System.out.println("Generate some Error on this application");
       	    }
       	System.out.println("Adding two values is :"+k);
       }
	}
	synchronized void enterValue(int a , int b){
       System.out.println("intputing values..........");
       i=a;
       j=b;
       k=a+b;
       notify();
	}
}
class Excute{
	public static void main(String[] args) {
		First first = new First();
		new Thread(){
            public void run(){
            	first.display();
            }
		}.start();
		new Thread(){
            public void run(){
            	first.enterValue(4,5);
            }
		}.start();
	}
}
