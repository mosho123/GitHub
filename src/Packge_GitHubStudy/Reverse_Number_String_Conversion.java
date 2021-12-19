package Packge_GitHubStudy;

public class Reverse_Number_String_Conversion {

	public static void main(String[] args) 
	{
		int a=1234;
		
		// integer to string conversion
		//integer. ha formula use karane
		String strngnumber = Integer.toString(a);
        String Revrsenumber=" ";
        
        for(int i=strngnumber.length()-1;i>=0;i--)
        {
        	Revrsenumber=Revrsenumber+strngnumber.charAt(i);
        }
          System.out.println(Revrsenumber);
	  
          // string to integer  for that below formula
          //integer.parseInt....use krne
          
         int rvrvnmber2= Integer.parseInt(Revrsenumber);
         
         System.out.println(rvrvnmber2);
	}

}
