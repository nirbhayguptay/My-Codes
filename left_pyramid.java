/*

*
**
***
****
*****
******

*/
import java.io.*;
class left_pyramid
{
	public static void main(String[] args)throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		System.out.print("Input number of lines you want = ");
		int n=Integer.parseInt(z.readLine());
		int x,y;
		for(x=1;x<=n;x++)
		{
			for(y=1;y<=x;y++)
				System.out.print("*");
			System.out.println();
		}
	}
}