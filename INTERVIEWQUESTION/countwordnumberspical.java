package INTERVIEWQUESTION;

public class countwordnumberspical {
public static void main(String[] args) {
	String ll="Gobb formed in 1212!@$$$$@#!@$!%&%^*";
	int word=0;
	int number=0;
	int specialchar=0;
  // char[] kk=ll.toCharArray();
	for(int i=0;i<ll.length();i++)
	{
		char ch=ll.charAt(i);
		if(ch>='A'&ch<='Z'||ch>='a'&&ch<='z')
		{
			word++;
		}
	    if(ch>='0'&&ch<='9')
		{
	    	number++;
		}
	    else
	   {
	    	specialchar++;
		}
	}
	System.out.println("the number of character is"+word);
	System.out.println("the number of number is"+number);
	System.out.println("the number of special "+specialchar);
}
}
