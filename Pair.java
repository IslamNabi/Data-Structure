import java.util.Scanner;
class Pair
{
	public static void findPair(int[] array, int target)
	{
		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++)
			{
				if((array[i]+array[j]) == target)
				{
					System.out.print("Pair is: "+array[i]+" "+array[j]);
					return;
				}
			}
		}
		
		System.out.println("Pair Does Not Exist:");
	}
		
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr=null;
		if(n>0)
		{
			arr = new int[n];
		}
		else
			System.out.println("Please Enter a Number Greater than 0:");
		System.out.println("Enter the Values of Array: ");
		for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt();
		}
		System.out.println("Enter Target Sum of Pair: ");
		int target = sc.nextInt();
		findPair(arr, target);
	}
}