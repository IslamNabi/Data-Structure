//Stack
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

}