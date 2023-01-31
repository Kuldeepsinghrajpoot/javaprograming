using System;
using System.Io;
class consoleDemo{
	public static void main(String args[]){
		String name;
		System.out.println("Enter the name :");
		name= System.Console().readLine();
		System.out.println("name is from scan by 'System.Console().readLine()'"+name);
	}
}