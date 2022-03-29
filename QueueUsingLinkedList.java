//crearting a node class
class Node 
{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class QueueUsingLinkedList
{
	private static Node rear = null, front = null;
	//enqueue method
	void enqueue(int data){
		Node newNode = new Node(data);
		if(front == null){
			System.out.println("Inserting "+data);
			front = newNode;
			rear = newNode;
		}
		else
		{
			System.out.println("Inserting "+data);
			rear.next = newNode;
			rear = newNode;
		}
	}
	//dequeue method
	void dequeue(){
		if(front ==  null){
			System.out.println("Queue is Empty!");
		}
		else
		{
			System.out.println("Removing "+front.data);
			front = front.next;
		}
	}
	//isEmpty
	boolean isEmpty(){
		return front == null;
	}
	//peek method
	int peek(){
		return front.data;
	}
//main method
	public static void main (String arg[])
	{
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println("Front Element is "+queue.peek());
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		if(queue.isEmpty()){
			System.out.println("Queue is Empty!");
		}else{
			System.out.println("Queue is Not Empty!");	
		}

	}
}