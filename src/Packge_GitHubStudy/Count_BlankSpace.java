package Packge_GitHubStudy;

public class Count_BlankSpace {

	public static void main(String[] args)
	{
		String s=" i : love : my : india ";
		String ref=":"  ;
		
		String M []=s.split(ref);   // string = group of characters
		                             // array = group of strings
		int count=0;
	    
		for (int i=0 ;i<=3;i++)    // Here i=0,1,2,3        
	    {
	    	System.out.println(M [i]);
	    }
	
	    
	    // below program for counting i in given straing
		
		 char X='i';
		 for (int i=0;i<=s.length()-1;i++)
			
		{
			if(X==s.charAt(i))
			{
				 count ++;
			}
		}
		 System.out.println(count);

	}

}
