package INTERVIEWQUESTION;

public class MAXIMUMSTRING {
public static void main(String[] args) {
	String p="hello hello mere bhagwan bhagwan bhagwan";
	String [] ll=p.split(" ");
	int count1=0;
	int res=0;
	String hh="";
	for(int i=0;i<ll.length;i++)
	{
		count1=0;
		for(int j=0;j<ll.length;j++)
		{
			if(ll[i].equals(ll[j]))
			{
				count1++;
				i=j;
			}
		}
		if(res<count1)
		{
			hh=ll[i];
			res=count1;
		}
	}
	System.out.println(hh+" "+res);
}
}
