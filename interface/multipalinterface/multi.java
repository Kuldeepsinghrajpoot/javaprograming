interface circle{
	public double pi=3.14;
}

interface square extends circle{
	public int length=5;
}

class draw implements square{
	void display(int b , int c){
        int calculate = length*b*c;
        System.out.println("This is a first of the passing the value calculate"+calculate);
	}
	void displayCircle(int b,int c){
        double result = pi*b*c;
        System.out.println("This is second of the passing the value of calculate"+result);
	}

}
class multi{
	public static void main(String[] args) {
		draw dr = new draw();
		dr.display(4,5);
		dr.displayCircle(4,5);
	}
}