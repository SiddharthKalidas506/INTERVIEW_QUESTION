package INTERVIEWQUESTION;

public class UniqueCombination {
public static void main(String[] args) {
	int [] q={10,1,2,7,6,1,5};
	int e=8;
	int m[]=new int[q.length];
	for(int i=0;i<q.length;i++)
	{
		int k=0;
		for(int j=i+1;j<q.length;j++)
		{
			 k=q[i]+q[j];
			 int l=q[i];
			 int f=q[j];
			 if(k==e)
			 {
				 System.out.println(l);
				 System.out.println(f);
			 }
			
		}
	}
}
}
