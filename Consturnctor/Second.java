class First{
	int a=0;
	First(){
		a=5;
		System.out.println("Constructors invoke : "+a);
	}
}

class Second{
        public static void main(String[] args) {
	       First fisrt= new First();  
    }
}