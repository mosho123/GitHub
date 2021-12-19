package Packge_GitHubStudy;

public class Remove_Special_Charactr {

	public static void main(String[] args) 
	{
		String s="Velocity@";
        
		String s1 = s.replace("@", "");
		
		System.out.println(s1);
		
		
		String s2 ="vel@oci@ty";
		
		String S3 = s2.replaceAll("[^a-zA-Z0-9]", ""); // VIMP FORMULAAAA
		
		System.out.println(S3);		
		
		
	}

}
