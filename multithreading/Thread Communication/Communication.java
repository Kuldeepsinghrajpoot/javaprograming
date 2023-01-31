class Circle{
	float radius = 0.0f;
	synchronized void output(){
		System.out.println("output method invoke for displaying area of Circle......");
		if (radius==0) {
			System.out.println("Wating for input radius...");
			try{
				wait();// Here waiting for input radius but radius is in  second method so this is waiting stage and new stage is runnig
				//Thread.sleep(1000);
			}catch(Exception e){
               System.out.println("generate some error on this code");
			}
		}
		System.out.println("Area is = "+3.14*radius*radius);
	}
	synchronized void input(float r){
		System.out.println("Inputing radius...");
		radius =r;
        System.out.println("Radius value is recived...");
        notify();
	}
}
class Communication{
	public static void main(String[] args) {
		 Circle c = new Circle();
		new Thread(){
			public void run(){
				c.output();
			}
		}.start();
		new Thread(){
			public void run(){
				c.input(2.5f);
			}
		}.start();
	}
}