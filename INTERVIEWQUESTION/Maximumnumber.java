package INTERVIEWQUESTION;

public class Maximumnumber {
	public static void main(String[] args) {
		String mm="hello hhelehe";
		char [] bb=mm.toCharArray();
		char ll=' ';
		int count=0;
		int ch=0;
		for(int i=0;i<bb.length;i++)
		{
			count=0;
			for(int j=0;j<bb.length;j++)
			{
				if(bb[i]==bb[j])
				{
					count++;
					i=j;
				}
			}
			if(ch<count)
			{
				ll=bb[i];
				ch=count;
			}
		}
		System.out.println(ll+""+ch);
	}
}
