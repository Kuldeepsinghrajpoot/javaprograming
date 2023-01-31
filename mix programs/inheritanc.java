class a
int x;
 void fist( ){
	 System.out.println("This is first");
 }
}
class Second extends a{
	
	void first( ){
		System.out.println("This is second");
	}
}
class Final extends second{
	Final fi = new Final();
	fi.fist();
	fi.fist();
}