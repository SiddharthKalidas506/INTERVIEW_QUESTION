package INTERVIEWQUESTION;

import java.io.File;

public class Tomakefile {
public static void main(String[] args) {
	File ref=new File ("E:/BBA");
	boolean bb=ref.exists();
	if(bb==false)
	{
		ref.mkdir();
		System.out.println("file created");
	}
	else
	{
		System.out.println("file already");
	}
}
}
