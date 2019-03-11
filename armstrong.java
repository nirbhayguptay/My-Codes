import java.io.*;
class armstrong
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n,m,t,sum=0;
		System.out.print("Input a number = ");
		n=Integer.parseInt(z.readLine());
		m=n;
		while(n>0)
		{
			t=n%10;
			sum=sum+t*t*t;
			n=n/10;
		}
		if(sum==m)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");		
	}
}