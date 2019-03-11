import java.io.*;
class prime
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n,x;
		System.out.print("Input a number = ");
		n=Integer.parseInt(z.readLine());

		for(x=2;x<n;x++)
		{
			if(n%x==0)
				break;
		}
		if(x==n)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime number");
	}
}