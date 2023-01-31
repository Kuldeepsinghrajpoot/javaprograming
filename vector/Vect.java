import java.util.*;
class Vect{
	public static void main(String[] args) {
		Vector v = new Vector(5,1);
		for (int i=0;i<4 ;i++ ) {
			 v.add(i);
		}
		/* v.add(5);
		 v.add('k');
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		 v.add(5);
		//System.out.println(V);
		v.elementAt(0);
		System.out.println(v.elementAt(0));
		//V.removeElementAt(1);*/
		System.out.println(v);
		System.out.println("This is a size of Vector arry :"+v.size());
        System.out.println("This is a capacity of Vector arry :"+v.capacity());
	}
}