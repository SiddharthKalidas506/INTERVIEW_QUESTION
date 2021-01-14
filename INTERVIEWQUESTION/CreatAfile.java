package INTERVIEWQUESTION;

import java.io.File;
import java.io.IOException;

public class CreatAfile {
public static void main(String[] args)  {
   File n=new File("E://BB/nob.txt");
   boolean b=n.exists();
   if(b==false)
   {
	   try
	   {
		   n.createNewFile();
		   System.out.println("file created");
	   }
	   catch (IOException e)
	   {
		   e.printStackTrace();
	   }
   }
   else
   {
	   System.out.println("file alderady exist");
   }
}
}

