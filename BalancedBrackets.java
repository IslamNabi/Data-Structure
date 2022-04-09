import java.util.Scanner;
//char stack
class charStack
{
	char[] arr;
	int top;
	int size;
	charStack(int size){
		this.size = size;
		top = -1;
		arr = new char[size];
	}
	//push method
	void push(char c){
		if(top >= size){
			System.out.println("Stack is full");
		}else
		{
			arr[++top]=c;	
		}
	}
	
	//pop method
	char pop(){
		if(top<0){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			return arr[top--];
		}
	
	}
	//empty
	boolean isEmpty(){
		return top == -1;
	}
}

class BalancedBrackets
{
	//check method;
	 static boolean checkBalanced(String exp){
		charStack stack = new charStack(exp.length());
		char letter;
		for(int i=0; i<exp.length(); i++){
			letter = exp.charAt(i);
			if(letter == '[' || letter == '{' || letter == '('){
				stack.push(exp.charAt(i));
			}
			else
			{
				if(stack.isEmpty()){
					return false;
				}
				else
				{
					char pop_let = stack.pop();
					if(exp.charAt(i)==')' && pop_let != '('){
						return false;
					}
					else if(exp.charAt(i)=='}' && pop_let != '{'){
						return false;
					}
					else if(exp.charAt(i)==']' && pop_let != '['){
						return false;
					}
					
				}
				
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		else
		{
			return false;	
		}
	}
	
//main method
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Expression of Brackets: ");
		String exp = sc.next();
		System.out.println(checkBalanced(exp));
		
	}
}