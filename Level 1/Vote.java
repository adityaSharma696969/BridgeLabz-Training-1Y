import java.util.Scanner;
class Vote 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
       
        for(int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        for(int i = 0; i < age.length; i++) {
            int studentAge = age[i];
            if(studentAge < 0) {
                System.out.println("Invalid age");
            }
            else if(studentAge >= 18) {
                System.out.println("eligable for vote");
            }
            else {
                System.out.println("not eligable for vote");
            }
        }
    }
}