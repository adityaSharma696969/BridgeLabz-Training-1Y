import java.util.Scanner;
class TwoDToOneDArray{
	public static void main(String []arts){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nuber of rows");
		int rows=sc.nextInt();
		System.out.println("enter the nuber of coloumn");
		int cols=sc.nextInt();
		int[][]matrix=new int[rows][cols];
		System.out.println("Enter the element of the matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		int[]array=new int[rows*cols];
		int index=0;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				array[index]=matrix[i][j];
				index++;
			}
		}
		System.out.println("1D array element");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}