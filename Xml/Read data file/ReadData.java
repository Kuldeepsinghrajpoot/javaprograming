import java.io.*;

class ReadData{
	public static void main(String args[]) throws Exception{
		FileInputStream fi = new FileInputStream("file.xml");
		//FileOutputStream fo = FileOutputStream("second.txt");
		int i;
		while((i=fi.read())!=-1){
			System.out.print((char)i);
		}
		fi.close();
	}
}
		