import java.util.Scanner;
class odd 
{
public static void main(String arg[])
{
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i = 1;
System.out.println("for even number");
for(i=1;i<a;i++){
	if(i%2==0){System.out.println(+i);}
}
System.out.println(i);
System.out.println("for odd no");
for(i=1;i<=a;i++){
	if(i%2!=0){
	System.out.println(+i);}
}
}
}
 	
	