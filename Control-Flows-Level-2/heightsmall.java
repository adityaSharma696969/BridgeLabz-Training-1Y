import java.util.Scanner;
class height{
	public static void main(String arg[])
	{
		System.out.println("enter height");
		Scanner sc = new Scanner(System.in);
		int amar = sc.nextInt();
		int akbar = sc.nextInt();
		int anthny = sc.nextInt();
		System.out.println("enter age");
		int amara= sc.nextInt();
		int akbara= sc.nextInt();
		int anthnya= sc.nextInt();
		if(amar>akbar&&amar>anthny){
		System.out.println("Amar is tallest");}
		else if(akbar>amar&&akbar>anthny){
		System.out.println("Akbar is tallest");}
		else if(anthny>amar&&anthny>akbar){
		System.out.println("Anthny is tallest");}   
		if(amara<akbara&&amara<anthnya){
		System.out.println("Amar is youngest");}
		else if(akbara<amara&&akbara<anthnya){
		System.out.println("Akbar is youngest");}
		else if(anthnya<amara&&anthnya<akbara){
		System.out.println("Anthny is youngest");}
	}
}