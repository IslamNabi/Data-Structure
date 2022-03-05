import java.util.Scanner;
class ArrayRotation
{	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//initializing array
		System.out.print("Enter Elements of Array: ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
	
		System.out.print("Enter Number of Rotation: ");
		int n = sc.nextInt();
		
		int[] rotatedArray = new int[size];
		//iniliazing this array the values after Number of Rotation Given
		int j=0;
		for(int i=n; i<arr.length; i++)
		{
			rotatedArray[j] = arr[i];
			j++;
		}
		for(int i=0; i<n; i++)
		{
			rotatedArray[j] = arr[i];
			j++;
		}
		
		//Displaying Rotated Array
		for(int i=0; i<rotatedArray.length; i++)
		{
			System.out.print(rotatedArray[i]+" ");
		}
	}
}