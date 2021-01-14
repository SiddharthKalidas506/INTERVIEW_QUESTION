package INTERVIEWQUESTION;

public class COUNTINGLTTERS {
	public static void main(String[] args) {
	     String p="my  llalalala  my";
	     char [] u=p.toCharArray();
	 	int count=0;
	     for(int i=0;i<p.length();i++)
	     {
	    	  char cc=u[i];
	    	  if(cc>='a'&& cc<='z'||cc>='A'&&cc<='Z')
	    	  {
	    		  count++;
	    	  } 
	     }
	     System.out.println(count);
		}}

