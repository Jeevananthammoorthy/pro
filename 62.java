import java.util.*;

class 62{
	public static void main (String[] args) {
  Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	 int length=0;
	 String sample=null,ans=null;
	for(int index=0;index<s.length();index++)
	    for(int index1=index+1;index1<s.length();index1++)
	    {
	   sample=s.substring(index,index1);
	       StringBuffer sb=new StringBuffer(sample);
	       if(((sb.reverse()).toString().equals(sample))&&(sample.length()>length))
	       {
	           length=sample.length();
	           ans=sample;
	       }
	    }
	    
	    System.out.println(ans);
	}
}
