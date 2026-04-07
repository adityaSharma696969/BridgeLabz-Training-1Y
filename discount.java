import java.util.Scanner;
class discount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("University fees");
		int fees=sc.nextInt();
		double Discount=(fees*10)/100;
		System.out.println("Discounted fees; "+Discount);
		}
}

		
