package Packge_GitHubStudy;

public class Count_BlankSpaces {

	public static void main(String[] args) 
	{
	
			String given =" i love my india ";
			
			int count =0;
			
			for (int i=0;i<=given.length()-1;i++)
			{
				  char blank=' ' ;
				  
			if (blank==given.charAt(i))
				{
					count++;
				} 
			}
				
				System.out.println("total blank spaces are"+ count);
			    System.out.println(given.length());
			
			
			
			
		   
		  
			
		

	}

}
