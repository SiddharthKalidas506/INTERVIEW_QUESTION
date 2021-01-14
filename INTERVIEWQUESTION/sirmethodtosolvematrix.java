package INTERVIEWQUESTION;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;
public class sirmethodtosolvematrix {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a AUTOMORPHIC NUMBER");
	int l=scn.nextInt();
	int ii=l*l;
	int u=l*l;
	String gg="";
	gg=gg+l;
	int fz=0;
	int z=0;
	int  j=0;
	int kk=0;
	int count=0;
	do
	{
		ii=ii/10;
		count++;
	}
	while(ii>0);
	System.out.println(count);
	if(count <=2)
	{
	for(int i=0;i<1;i++)
	{
	    z=u%10;
	    u=u/10;
	}
	j=j+z;
	}
	if(count>2)
	{
	for(int jj=0;jj<1;jj++)
	{
	      fz=u%10;
	}
	kk=kk+fz;
	}
	String as="";
	if(count<=2)
	{
	as=as+j;
	}
	else
	{
		as=as+kk;
	}
	char [] fff=gg.toCharArray();
	char [] nbnb=as.toCharArray();
	for(int i=0;i<fff.length;i++)
	{
		//for(int j=0;j<nbnb.length;j++)
		//{
			
	//	}
	}
}}
