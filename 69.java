import java.util.*;

class 69{
	public static void main (String[] args) {
            int sum1=0,sum2=0;
		Scanner in=new Scanner(System.in);
		    String str=in.nextLine();
		  String h=str.replaceAll("[a-zA-Z!@#$%^&*()_-]","");
		  char[] chararray=h.toCharArray();
		    Arrays.sort(chararray);
		    int minnum=Character.getNumericValue(chararray[0]);
		    int maxnum=Character.getNumericValue(chararray[chararray.length-1]);
		    sum1=add(chararray,maxnum);
		    sum2=add(chararray,minnum);
		    System.out.println(sum1<sum2?sum1:sum2);
	}
		    static int add(char arr[],int maxnum){
		        int temp=0,a=0;
		    for(int index=0;index<arr.length;index++)
		    {
		        a+=(Character.getNumericValue(arr[index])*(maxnum));
		    }
		    temp=a%9;
	           return temp==0?0:temp;
		    }
}
