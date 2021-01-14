package INTERVIEWQUESTION;

public class Gofurg 
{
	 static void prefixexist(String x,String y,int m,int n)
	  {
	    int [] [] lcsuf=new int[m+1][n+1];
	    int length=0;
	    int rows=0;
	    int columns=0;
	    for(int i=0;i<=m;i++)
	    {
	      for(int j=0;j<=n;j++)
	      {
	        if(i==0||j==0)
	          lcsuf[i][j]=0;
	        else if(x.charAt(i-1)==y.charAt(j-1))
	        {
	          lcsuf[i][j]=lcsuf[i-1][j-1]+1;
	          if(length<lcsuf[i][j])
	          {
	            length=lcsuf[i][j];
	            rows=i;
	            columns=j;
	          }
	        }
	        else
	          lcsuf[i][j]=0;
	      }
	    }
	    if(length==0)
	    {
	      System.out.println("-1");
	      return;
	    }
	    String result=" ";
	    while(lcsuf[rows][columns]!=0)
	    {
	      result=x.charAt(rows-1)+result;
	      --length;
	      rows--;
	      columns--;
	    }
	    System.out.println(result);
	  }
	  public static void main(String [] args)
	  {
	    String x="zxabcdezy";
	      String y=x;
	      int m=x.length();
	    int n=y.length();
	    prefixexist(x,y,m,n);
	  }
	   }
