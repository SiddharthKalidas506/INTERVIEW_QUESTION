package INTERVIEWQUESTION;

import java.util.Scanner;

public class matrixcalulation
{
	public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 
	         int i,j,row,col,rsum=0,lsum=0,ssum=0;
	 System.out.println("Enter the number of rows:");
	 row = sc.nextInt();
	 System.out.println("Enter the number of columns:");
	 col = sc.nextInt();
	 int[][] mat = new int[row][col];
	 
	     System.out.println("Enter the elements of the matrix") ;
	     for(i=0;i<row;i++)
	 { 
	      for(j=0;j<col;j++)
	      { 
	          mat[i][j] = sc.nextInt();
	      }
	 }
	     System.out.println("The elements of the matrix") ;
	     for(i=0;i<row;i++)
	   { 
	      for(j=0;j<col;j++)
	      { 
	        System.out.print(mat[i][j]+"  ");
	      }
	       System.out.println(" ");
	   }
	 
	     for(i=0;i<row;i++)
 { 
	      for(j=0;j<col;j++)
     { 
	     if(i==j) 
	     {
	         rsum = rsum + mat[i][j];
	     }
	     else if((i+j)==(row-1))
	     {
	    	lsum=lsum+mat[i][j]; 
	     }
     }
 }
	     System.out.println("right side of diagnol is"+rsum);
	     System.out.println("left side of diagnol is"+lsum);
	     ssum=rsum+lsum;
	     System.out.printf("SUM of DIAGONAL elements of the matrix = "+ssum) ;
	 } 
}