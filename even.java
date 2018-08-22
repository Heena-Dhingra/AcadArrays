import java.util.Scanner;
class even{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int i,count=0;
		for(i=0;i<num;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println(i);
			}
		} 
		System.out.println("There are "+count+" even numbers upto "+num);
	}
}