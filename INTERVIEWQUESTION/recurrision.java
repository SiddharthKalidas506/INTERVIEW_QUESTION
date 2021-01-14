package INTERVIEWQUESTION;

public class recurrision {
public static void main(String[] args) {
    int base=5;
    int power=3;
    int res=1;
    res=findresult(base,power,res);
    System.out.print(res);
    }
    static int findresult(int base,int power,int res) 
    {
      res=res*base;
      power--;
      if(power>0)
        res=findresult(base,power,res);
        return res;      
}
}
