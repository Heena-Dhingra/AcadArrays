import java.util.Scanner;
class armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num= sc.nextInt();

		int a,n=0,rem=0,b=0;
		a = num;

		while(num!=0)
		{
			num=num/10;
			n++;
		} 
		num = a;
		while(num!=0)
		{
			rem = num%10;
			b = b + power(rem,n);
			num = num/10;
		}
		if(b==a)
		{
			System.out.println(a+" is an armstrong number");
		}
		else
		{
			System.out.println(a+" is not an armstrong number");
		}
	}
	static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++) 
         p = p*n;
 
      return p;   
   }
}