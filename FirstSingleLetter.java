import java.util.Scanner;
class FirstSingleLetter
{
	static final int SIZE = 7;
	static final char[] arr = new char[SIZE];
	
	//method
	
       public static char firstSingleLetter(char text[], int n){
       int count = 0;
           for(int  i = 0; i < n; i++){
               for(int j = 0; j < n; j++){
                   if(text[i] == text[j]){
                   count++;
                       }
                   }
               if(count == 1){
                   return text[i];
                   }else{
                   count = 0;
                   }
               }
           return ' ';
           } 

	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array of 7 Characters: ");
		for(int i=0; i<SIZE; i++){
			char let = sc.next().charAt(0);
			arr[i] = let;
		}
	
	System.out.println("First Single Letter in Array: ");
	char res = firstSingleLetter(arr,SIZE);
	System.out.println(res);
	
	}
}