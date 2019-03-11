import java.io.*;
class prime_series
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n1,n2,x,y;
		System.out.print("Input a start of range = ");
		n1=Integer.parseInt(z.readLine());
		System.out.print("Input a end of range = ");
		n2=Integer.parseInt(z.readLine());

		for(x=n1;x<n2;x++)
		{
			for(y=2;y<x;y++)
				if(x%y==0)
					break;		
			if(x==y)
				System.out.println(x);	
		}		
	}
}