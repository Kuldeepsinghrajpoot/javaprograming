import java.io.DataInputStream;
class readDatatFromKeybaord{
	public static void main(String args[]){
		DataInputStream in = new DataInputStream(System.in);
		int integerNumber = 0;
		float floatNumber=0.0f;
		try{
			System.out.println("Enter the integer number :");
			integerNumber=Integer.parseInt(in.readLine());
			System.out.println("Enter the float number");
			floatNumber=Float.valueOf(in.readLine());
		}
		catch(Exception e){
			System.out.println("Generate some error the code :"+e);
		}
		System.out.println("Integer value of enter by the user :"+integerNumber);
		System.out.println("Float value of enter by the user : "+floatNumber);
	}
}