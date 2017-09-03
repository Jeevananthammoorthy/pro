import java.util.*;

class 63.java{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
  String s=in.nextLine();
	 int length=0;
	 String sample=null,ans=null;
	for(int index=0;index<s.length();index++)
	    for(int index1=index+1;index1<s.length();index1++)
	    {
	    sample=s.substring(index,index1);
	    String[] string=sample.split("");
            LinkedHashSet<String> lhs=new LinkedHashSet<String>(Arrays.asList(string));
	       if(lhs.size()==sample.length()&&sample.length()>length)
	       {
	               length=sample.length();
	               ans=sample;
	       }
	    }
	    
	    System.out.println(ans);
	}
}
