import java.io.*;
class palindrome
{
	public static void main(String[] args)throws Exception
	 {
		DataInputStream z=new DataInputStream(System.in);
		int l,x;
		String s1,s2="";
		System.out.print("Input = ");
		s1=z.readLine();
		s1=s1.toUpperCase();// just done to make Nirbhay equal to nirbhay
		l=s1.length();

		for(x=l-1;x>=0;x--)
		{
			s2+=s1.charAt(x);
		}
		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}