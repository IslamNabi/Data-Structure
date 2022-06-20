import java.util.Scanner;
class SelectionSort
{
	//selection sort method
	public static void selectionSort(int[] ar, int n){
		for(int i=0; i<n; i++){
			int min = i;
			for(int j=i+1; j<n; j++){
				if(ar[j] < ar[i]){
					min = j;
				}
			}
			int temp = ar[min];
			ar[min] = ar[i];
			ar[i] = temp;
		}
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" Values in Array: ");
		System.out.println("Original Array: ");
		for(int i=0; i<n; i++){
			int val = sc.nextInt();
			arr[i] = val;
		}
		System.out.println("Sorted Array: ");
		selectionSort(arr, n);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+", ");
		}
		
	}
}