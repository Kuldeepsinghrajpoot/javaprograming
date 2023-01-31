interface first{
	double pi = 3.14;
}

class circle implements first{
	void passingValue(int a , int b){
		double c= b*a*pi;
		System.out.println("Calculate the circle "+c);
	}
}
class inter{
	public static void main(String[] args) {
		circle ci = new circle();
		ci.passingValue(5,6);
	}
}