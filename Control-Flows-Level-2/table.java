import java.util.Scanner;
class table
{
	public static void main(String ar[])
	{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int table = 1;                         
         if(a>=6&&a<=9){
			 for(int i=1;i<=10;i++){
			 table= a*i;
			 System.out.println(table);
		 }
		 }                                            
		 else{
		 System.out.println("Not a valid input");}
		                           


		 }
	}