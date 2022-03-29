//Stack class
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
	//isEmpty
	boolean isEmpty(){
		return tos<0;
	}
}
class QueueUsingTwoStacks
{
	//Stacks
	MyStack stack1;
	MyStack stack2;
	//constructor
	QueueUsingTwoStacks(int size){
		stack1 = new MyStack(size);
		stack2 = new MyStack(size);
	}
	
	//enqueue method
	void enqueue(int data){
		//move all elements from stack 1 to satck2
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		
		stack1.push(data);
		
		//move all elements from satck2 to stack 1
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
	}
	//dequeue
	int dequeue(){
		return stack1.pop();
	}

//main method
	public static void main(String arg[])
	{
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());		
		}
}