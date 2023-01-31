class Contruct{
	int a=0;

	Contruct(){
		a=5;
		System.out.println("Calling by Counstuctor"+a);
	}
}

    class Counstuctor{
       static void main(String[] args) {
	    Contruct counstuctor = new Contruct();
	   // counstuctor.a;
    }
}