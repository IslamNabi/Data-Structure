import java.util.Scanner;
class SubArrayWithSumZero
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//initializing Array
		System.out.print("Enter Elements of Array: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		//checking subArray with Sum 0
		
		for(int i=0; i<arr.length; i++){
			int sum=0;
			for(int j=i; j<arr.length; j++){
				sum += arr[j];
				if(sum==0)
					System.out.println("SubArray is at index: "+i+"-"+j);
			}
		}
	}
}