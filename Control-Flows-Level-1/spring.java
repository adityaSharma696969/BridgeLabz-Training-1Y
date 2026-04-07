import java.util.Scanner;
class Spring{
	public static void main(String arg[])
	{
		System.out.println("Enter no of days and month");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int month = sc.nextInt();
		if(month==3&&days>=20||month==4||month==5||month==6 && days<=20){
			System.out.println("Its a springh season");
		}
		else{
		System.out.println("not a spring season");
		}
	}
}
