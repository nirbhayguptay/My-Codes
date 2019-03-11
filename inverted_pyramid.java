/*

***********
 *********
  *******
   *****
    ***
     *
*/
import java.io.*;
class inverted_pyramid
{
	public static void main(String[] args)throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		System.out.print("Input number of lines you want = ");
		int n=Integer.parseInt(z.readLine());
		int x,y;
		for(x=n;x>=1;x--)
		{
			for(y=n;y>x;y--)
				System.out.print(" ");
			for(y=1;y<=2*x-1;y++)
				System.out.print("*");
			System.out.println();
		}
	}
}