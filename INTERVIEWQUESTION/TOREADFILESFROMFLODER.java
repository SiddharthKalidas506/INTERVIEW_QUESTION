package INTERVIEWQUESTION;

import java.io.FileReader;
import java.io.IOException;

public class TOREADFILESFROMFLODER {
public static void main(String[] args) {
	FileReader fr=null;
	try
	{
		fr=new FileReader("E://BBA/noob.txt");
		int val=fr.read();
		while(val!=-1)
		{
			System.out.print((char)val);
			val=fr.read();
		}
	}
	catch(IOException  e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}
