import java.io.*;
class fibbonaci
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int n,x,a=0,b=1,t;;
		System.out.print("Input number of term in series(minimum 2) = ");
		n=Integer.parseInt(z.readLine())-2;
		System.out.print("0 1 ");		
		for(x=1;x<=n;x++)
		{
			t=a+b;
			a=b;
			b=t;
			System.out.print(t+" ");
		}				
	}
}