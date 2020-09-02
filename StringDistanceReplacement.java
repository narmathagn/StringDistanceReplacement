import java.util.*; 
public class StringDistanceReplacement{
	public static void main(String args[]){
		String s="bangalore";
		String s1="";
		String s2="";
		int j=0,f=0;
		char c1='\u0000';
		for(int i=1;i<s.length();i++)
		{
			int a=s.charAt(j)-'a'+1;
			int b=s.charAt(i)-'a'+1;
			int c=a+b;
		    if(c>26)
		    {
		        f=c-26;
		        c1=(char)('a'+f-1);
		    }
		    else
		    {
			    c1=(char)('a'+c-1);
		    }
			String r=String.valueOf(c1);
			//System.out.println("r in 1:"+r);
			s1=s1+r;
			j++;
		}
		int n1=s.length();
		int n2=s1.length();
		int n=n1+n2;
		int k=0,m=0;
		for(int i=0;i<n;i++)
	    {
	        if(i%2==0)
	        {
	            s2=s2+Character.toString(s.charAt(m));
	            m++;
	        }
	        else
	        {
	            s2=s2+Character.toString(s1.charAt(k));
	            k++;
	        }
	    }
	    System.out.println(s2);
	}
}