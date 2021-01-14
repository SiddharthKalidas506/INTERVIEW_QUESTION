package INTERVIEWQUESTION;

import java.util.Scanner;

public class shiftingwordswithinterger 
{
public static void main(String[] args) 
{	
	Scanner c=new Scanner(System.in);
	System.out.println("enter the number in which u have to shift");
	int w=c.nextInt();
	//Scanner p=new Scanner(System.in);
	//System.out.println("enter the words");
	String m="hello world";
	System.out.println(m);
	String [] mm=m.split(" ");
	for(int i=0;i<mm.length;i++)
	{
		 String cc=mm[i];
		 char [] QQ=cc.toCharArray();
		 for(int j=0;j<QQ.length;j++)
		 {
			 int pp=QQ[j];
			 int ll=pp+w;
			 System.out.print((char)(ll));
	}    }}}
