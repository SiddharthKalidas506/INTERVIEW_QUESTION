package INTERVIEWQUESTION;

import java.util.Scanner;

public class CONNECTINGDOTS {
public static void main(String[] args) {
	int q=2;
	int e=1;
	int w=3;
	int x=3;
	Scanner h=new Scanner(System.in);
	System.out.println("enter nuber of points");
	int r=h.nextInt();
	for(int i=2;i<=r;i++)
	{
		if(i%2==0)
		{
			if(r==q)
			{
			System.out.println(e);
			}
			q=q+2;
			e=e+5;	
		}
		else if(i%2!=0)
		{
			if(r==w)
			{
			System.out.println(x);
			}
			w=w+2;
			x=x+5;
		}
	}
   h.close();
}
}
