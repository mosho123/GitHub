package Packge_GitHubStudy;

public class Febonancy_Seriess {

	public static void main(String[] args) 
	{
	  int a=0;
	  int b=1;
	  
   for (int i=1 ; i<15 ; i++)
   {
	   int sum = a+b;   // here output is 0+1=1
	   System.out.println(b);   // here print value 1
	   a=b;             // here increment is going on 
	   b=sum; 	   
   }
	}

}
