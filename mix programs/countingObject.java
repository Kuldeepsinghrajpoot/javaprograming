class Count{
	int count;
	 Count(){
		System.out.println("this is fist class ");
		count+=1;
		System.out.print("object counter is:"+count);
	}
}
class nextCount extends Count{
	 nextCount(){
		System.out.print("This is second class ");
	}
}

