import java.util.Scanner;
class firebuzz
{
	public static void main(String arg[])
	{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int table=0;
		if(a>0){
		for(int i = 1;i<=a; i++)
		{
			if(i%3==0&&i%5==0){System.out.println("FireBuzz");}
            else if(i%5==0){System.out.println("Buzz");}
            else if(i%3==0){System.out.println("Fire");}
			else{
		    System.out.println(i);}
		}
	}

	}
}


				
			
			