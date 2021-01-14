package INTERVIEWQUESTION;

public class tiangle {
public static void main(String[] args) {
	int n=5;
	int spc=n-1;
	int str=1;
	char ch='a';
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<spc;j++)
		{
			System.out.print(" "+" ");
		}
			for(int k=0;k<str;k++)
			{
				if(k<str/2)
				{
				System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(ch--+" ");
				}
			}
			System.out.println();
			ch='a';
			str=str+2;
			spc--;
		}
	}

}
