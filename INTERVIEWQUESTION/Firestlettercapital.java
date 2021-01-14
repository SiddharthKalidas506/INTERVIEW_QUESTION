package INTERVIEWQUESTION;
public class Firestlettercapital {
public static void main(String[] args){
	String g="tHE woRLD is full of deviles";
	String [] hh=g.split(" ");
	String m="";
	for(int i=0;i<hh.length;i++){
		String ll=hh[i];
		char [] lll=ll.toCharArray();
		for(int j=0;j<lll.length;j++){
			char jj=lll[j];
			if(j==0){	
				if(jj>='A'&&jj<='Z'){
					m=m+jj;}
				else{
					m=m+(char)(jj-32);}}
			else{
				if(jj>='a'&&jj<='z'){
					m=m+jj;}
			else{
				 m=m+(char)(jj+32);}}}	
		m=m+" ";}
	System.out.println(m);}}
