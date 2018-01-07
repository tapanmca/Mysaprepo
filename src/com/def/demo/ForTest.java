package com.def.demo;

public class ForTest {

	public static void main(String[] args) {
		/*char[] ASD={'A','B','C','D','E'};
		// TODO Auto-generated meta stub
		//Tapan kumar Rout 123@345
		 //secndcomit of forchk
		 
		for(int i=1;i<=5;i++ )
		{

			for(int j=1;j<=i; j++)
				{
					if(j==1)
					{
						System.out.print(ASD[i-1]+" "+1+" ");
					}
					else
					{
						System.out.print(j+" ");
					}
					
				}
			
			System.out.println();
		}*/
		
		 int n, c, k, space = 1;
		 
		 // printf("Enter number of rows\n");
		 // scanf("%d", &n);
		 n=6;
		  space = n - 1;
		 String[] ch={"I","L","O","V","E","MY"};
		 String[] ch1={"L","O","V","E","MY"};
		 char[] ch2={'I','N','D','I','A'};
		  for (k = 1; k <= n; k++)
		  {
		    for (c = 1; c <= space; c++)
		    	 System.out.print(" ");
		 
		    space--;
		 
		    for (c = 1; c <= 2*k-1; c++)
		    	if(c==1)
		    	{
		    		System.out.print(ch[k-1]);
		    	}
		    	else if(c==2*k-1)
		    	{
		    	 System.out.print(ch1[k-2]);
		    	}
		    	else if(c==9)
		    	{
		    		
		    		System.out.print(ch1[k-2]);
		    		break;
		    	}
		    	else
		    	{
		    		System.out.print("*");
		    	}
		    	
		 
		    System.out.println();
			
		  }
		 
		  space = 1;
		 
		  for (k = 1; k <= n - 1; k++)
		  {
		    for (c = 1; c <= space; c++)
		    	 System.out.print(" ");
		 
		    space++;
		 
		    for (c = 1 ; c <= 2*(n-k)-1; c++)
		    	if(c==1)
		    	{
		    		System.out.print(ch2[k-1]);
		    	}
		    	else if(c==2*(n-k)-1)
		    	{
		    	 System.out.print(ch2[k-1]);
		    	}
		    	else
		    	{
		    		System.out.print('*');
		    	}
		 
		    System.out.println();
			 
		  }
		 
		  
	}

}
