import java.io.*;
class factors
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n,x,sum=0;
		System.out.print("Input a number = ");
		n=Integer.parseInt(z.readLine());

		for(x=1;x<=n;x++)
		{
			if(n%x==0)
				sum+=x;
		}
		System.out.println("Sum of factors is = "+ sum);
	}
}