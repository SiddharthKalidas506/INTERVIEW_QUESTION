package INTERVIEWQUESTION;
public class tofindnonrepetingcharacter {
public static void main(String[] args) {
	String gg="have a nice day";
	char [] l=gg.toCharArray();
	char u=' ';
	int p=1;
	int count=0;
	for(int i=0;i<l.length;i++)
	{
		count=0;
		for(int j=i;j<l.length;j++)
		{
			if(l[i]==l[j])
			{
				count++;
				i=j;
			}
		}
		if(p<=count)
		{
			u=l[i];
		}
	}
	System.out.println(u+"");
}
}
