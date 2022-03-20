
class MyStack 
{
	private int[] arr;
	private int tos;
	int size;
	public MyStack(int size){
		this.size = size;
		arr = new int[size];
		tos = -1;
	}
	//push method
	void push(int item){
		if(tos>=size){
			System.out.println("Stack is full!");
		}
		else
		{
			tos++;
			arr[tos]=item;
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

	//main method
	public static void main (String arg[]){
		MyStack stack = new MyStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		int poped = stack.pop();
		System.out.println(poped+" is Poped from Stack!");
		int poped2 = stack.pop();
		System.out.println(poped2+" is Poped from Stack!");
	}
}