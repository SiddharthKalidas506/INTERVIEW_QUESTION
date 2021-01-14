package INTERVIEWQUESTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Libarary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number Of Book to be added to library ");
	int k=s.nextInt();
	String [] o=new String [k];
	Scanner s1=new Scanner(System.in);
	for(int i=0;i<k;i++)
	{
		System.out.println("Enter the books you wish");
		o[i]=s1.next();		
	}
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter your preference 1-to see all the books , 2-To add a new book ,3- to delete a book,4-to replace a book");
	int h=s2.nextInt();
	if(h==1)
	{
		for(int i=0;i<k;i++)
		{
			System.out.println(o[i]);
		}
	}
	// type 2
	if(h==2)
	{
		 
	      System.out.println(Arrays.toString(o));
	      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(o));
	      System.out.println("Enter the element that is to be added:");
	      String element = s.next();
	      myList.add(element);
	      o = myList.toArray(o);
	      System.out.println(Arrays.toString(o));
	   }
	if(h==3)
	{
		  ArrayList<String> alphabets = new ArrayList<String>(Arrays.asList(o));
	       Scanner x=new Scanner(System.in);  
	        System.out.println("enter the book name to be remove");
	      String q=x.next();
	        alphabets.remove(q);        
	        System.out.println(alphabets);
	}
	if(h==4)
	{
	     ArrayList<String> list = new ArrayList<String>(Arrays.asList(o));
	     Scanner v=new Scanner(System.in);
	     System.out.println("enter the book name to be replaced ");
	     String kk=v.next();
	       int index = list.indexOf(kk);
	       Scanner v1=new Scanner(System.in);
		     System.out.println("enter the 'new' book name to be replaced ");
		     String kk1=v1.next();
	        list.set(index, kk1);
	         
	        System.out.println(list);
	}
	}
	
}
