import java.util.Scanner;
import java.util.Random;
class extract_Boundaries
{
	public static int r=0,c=0;
	//method that prints boundaries
	public static void extractBoundaries(int[][] array){
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i==0 || j==0 || i==(r-1) || j==(c-1))
					System.out.print(array[i][j]+" ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	
	//method that print center part of array
	public static void cropCenterPart(int[][] array){
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i==0 || j==0 || i==(r-1) || j==(c-1))
					System.out.print("  ");
				else
					System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows: ");
		r = input.nextInt();
		System.out.println("Enter columns: ");
		c = input.nextInt();
		//creating a 2D Array
		int[][] arr = new int[r][c];
		
		//creating obj of Random class
		Random rand = new Random();
		
		//initializing Array random values
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				arr[i][j]=rand.nextInt(10);
			}
		}
		
		//diplay arr
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//extracting boundaries
		extractBoundaries(arr);
		//extracting centerpart
		System.out.println();
		cropCenterPart(arr);	
	}
}