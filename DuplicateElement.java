import java.util.Scanner;

class DuplicateElement
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		String duplicates="";
		System.out.println("Enter Elemnts of Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}													
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					if(!(duplicates.contains(""+arr[i])))
					duplicates += arr[i];
				}
			}
		}
		System.out.println("Duplicates are: ");
		for(int i=0; i<duplicates.length(); i++){
		System.out.print(duplicates.charAt(i)+" ");
		}
	}
}