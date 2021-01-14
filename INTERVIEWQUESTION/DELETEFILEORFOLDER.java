package INTERVIEWQUESTION;

import java.io.File;

public class DELETEFILEORFOLDER {
public static void main(String[] args) {
	File b=new File("E://BBA");
	boolean n=b.exists();
	if(n==true)
	{
		b.delete();
		System.out.println("file deledted");
	}
	else
	{
		System.out.println("file alderady deldted");
	}
}
}
