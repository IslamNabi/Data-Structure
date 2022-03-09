import java.util.Scanner;

class SortBinaryArray
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Binary Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//initializing array with 0 and 1
		System.out.println("Enter Elements of Binary Array: ");
		for(int i=0; i<size; i++){
			int input = sc.nextInt();
			if(input == 0 || input == 1){
			arr[i] = input;
			}
			else{
			System.out.println("Invalid data!");
			break;
			}
		}
		//displaying original array
		System.out.println("Original Array: ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		int[] sortedArray = new int[size];
		//counting zeros in array
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 0)
				count++;
		}
		
		//sorting the given array
		for(int i=0; i<size; i++){
			if(i<count){
				sortedArray[i]=0;
			}
			else
			{
				sortedArray[i]=1;
			}
		}
		System.out.println("\nSorted Array: ");
		//diplaying sorted Array
		for(int i=0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i]+" ");
		}

	}
}