//creating node class
class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data = data;
	}
}

class StackUsingLinkedList
{
	private Node top;
	StackUsingLinkedList(){
		this.top = null;
	}
	//push method
	void push(int data){
		Node newNode = new Node(data);
		if(top == null){
			System.out.println("Inserting "+data);
			top = newNode;
		}
		else
		{
			System.out.println("Inserting "+data);
			newNode.next = top;
			top = newNode;
		}
	}
	//isEmpty method
	boolean isEmpty(){
		return (top == null);
	}
	//peek method
	int peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty!");
			return -1;
		}else{
			return top.data;
		}
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty!");
		}
		else
		{
			System.out.println("Removing "+top.data);
			top = top.next;
		}
	}
	//main method
	public static void main(String arg[])
	{
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Top Element is: "+stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		if(stack.isEmpty()){
			System.out.println("Stack is Empty!");
		}
		else
		{
			System.out.println("Stack is Not Empty!");
		}
	}
}