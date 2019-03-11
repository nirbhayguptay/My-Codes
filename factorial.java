import java.io.*;
class factorial
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n,x,fact=1;
		System.out.print("Input a number = ");
		n=Integer.parseInt(z.readLine());

		for(x=1;x<=n;x++)		
			fact*=x;

		System.out.println("Factorial is = "+ fact);
	}
}