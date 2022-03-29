class StackUsingArray
{
	private int[] arr;
	private int top;
	private int size=0;
	int length;
	//constructor
	StackUsingArray(int size){
		this.size = size;
		top=-1;
		arr = new int[size];
	}
	//push method
	void push(int item){
		if(isFull()){
			System.out.println("Stack is full");
		}
		else
		{
			System.out.println("Inserting "+item);
			arr[++top] = item;
			length++;
		}
	}
	//isFull method
	boolean isFull(){
		return top == size-1;
	}
	//pop method
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return -1;
		}
		else
		{
			length--;
			System.out.println("Removing "+arr[top]);
			return arr[top--];
		}
	}
	//isEmpty method
	boolean isEmpty(){
		return top == -1;
	}
	//size method
	int size(){
		System.out.println("Stack Size is: "+length);
		return 0;
	}
	//peek method
	int peek(){
		System.out.println("Top Element is "+arr[top]);
		return 0;
	}
	
	//main method
	public static void main (String arg[]){
		StackUsingArray stack = new StackUsingArray(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.peek();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		if(stack.isEmpty()){
			System.out.println("Stack is Empty.");
		}else
			System.out.println("Stack is not Empty.");
	}
}