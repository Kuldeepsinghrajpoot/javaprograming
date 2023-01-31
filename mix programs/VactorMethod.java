import java.util.*;
class VecTor{
	public static void main(String args[]){
		Vector list = new Vector();
		int length=args.length;
		for(int i=0;i<args.length;i++){
			list.addElement(args[i]);
		}
		list.insertElementAt("cobol",2);
		int size= list.size();
		String ListArray[]= new String[size];
		list.copyInto(listArray);
		System.out.println("List of the languages");
		for(int i=0;i<size;i++){
			System.out.println(listArray[i]);
		}
	}
}