package INTERVIEWQUESTION;

import java.io.File;

public class LETSTRY {
	public static void main(String[] args) {
	File ref=new File("E:/FILE11");
	boolean ccb=ref.exists();
	if(ccb==false)
	{
		ref.mkdir();
		System.out.println("folder Created");
	}
	else
	{
		System.out.println("folder existed");
	}}}



