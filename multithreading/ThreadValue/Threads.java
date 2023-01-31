class First{
	/*synchronized */void display(){
		System.out.println("This is a fisrt display ");
	}
	/*synchronized */void secondDisplay(){
		System.out.println("This is a second display");
	}
}
class Threads{
	public static void main(String[] args) {
		First f= new First();
		new Thread(){
			public void run(){
				 f.display();
			}
		}.start();
        	new Thread(){
        		public void run(){
        			 f.secondDisplay();
        		}
        	}.start();
        }
	}