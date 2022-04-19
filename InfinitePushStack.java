//Stack
class Stack 
{
	private int[] arr;
	private int tos;
	int size;
	public Stack(int size){
		this.size = size;
		arr = new int[size];
		tos = -1;
	}
	//push method
	void push(int item){
		if(tos>=size-1){
			Stack newStack = new Stack(size-1);
			for(int i=0; i<size-1; i++){
				newStack.push(arr[tos--]);
			}
			int temp = arr[tos--];
			
			for(int i=0; i<size-1; i++){
				arr[++tos] = newStack.pop();
			}
			arr[++tos]=item;
		}
		else
		{
			arr[++tos]=item;
		}
	}
	//pop method
	int pop(){
		if(tos<0){
			System.out.println("Stack is Empty!");
			return -1;
		}
		else
		{
			return arr[tos--];
		}
	}
	//isEmpty method
	boolean isEmpty(){
		return tos==-1;
	}
	//peek method
	int peek(){
		return arr[tos];
	}

}
class InfinitePushStack
{
	public static void main (String arg[])
	{
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		for(int i=0; i<5; i++){
			System.out.println(stack.pop());
		}
	}
}