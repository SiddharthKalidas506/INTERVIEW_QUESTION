package INTERVIEWQUESTION;

import java.io.FileWriter;
import java.io.IOException;

public class WRITECONTECTINFILE {
public static void main(String[] args) {
	FileWriter fw=null;
	try
	{
		fw=new  FileWriter("E://BBA/noob.txt");
		fw.write("hack this ");
		fw.write("is impossible");
		fw.write("thank you for ur intrest");
		fw.write("   ");
		fw.write("siddharth");
		fw.flush();
		System.out.println("data entered");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}
