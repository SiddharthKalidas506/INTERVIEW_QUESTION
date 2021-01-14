package INTERVIEWQUESTION;

public class Toremovelastword {
public static void main(String[] args) {
	String gg="the world is beautiful";
	String [] hh=gg.split(" ");
	String kk="";
	for(int i=0;i<hh.length-1;i++)
	{
		kk=kk+hh[i];
		kk=kk+" ";
	}
	System.out.println(kk);
}
}
