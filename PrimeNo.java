import java.util.Scanner;
class PrimeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,j,c;
		
		System.out.println("Enter the number:");
		int N=sc.nextInt();
		
		System.out.println("Prime numbers till "+N+" are:");
		for(i=1;i<=N;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
		      if(i%j==0)
		        {
			      c++;
		        }
		    }
		 if(c==2)
		   {
			System.out.println(i);
		   }
		}
		
	}

}
