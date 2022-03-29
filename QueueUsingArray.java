class QueueUsingArray
{
	private int[] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	//constructor
	QueueUsingArray(int size){
		arr = new int[size];
		front = -1;
		rear = -1;
		count = 0;
		capacity = size;
	}
	//isFull method
	boolean isFull(){
		return rear == capacity-1;
	}
	//isEmpty method
	boolean isEmpty(){
		return front > rear;
	}
	//enqueue method
	void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is Full!");
		}
		else
		{
			System.out.println("Inserting "+data);
			count++;
			front = 0;
			arr[++rear]=data;	
		}
	}	
	//dequeue method
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty!");
		}else{
			System.out.println("Removing "+arr[front]);
			count--;
			front++;
		}
	}
	//peek method
	int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty!");
			return -1;
		}else{
			return arr[front];
		}	
	}
	//size method
	int size(){
		return count;
	}
	
	//main method
	public static void main(String arg[])
	{
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		System.out.println("Front Element is: "+queue.peek());
		queue.dequeue();
		System.out.println("Front Element is: "+queue.peek());
		System.out.println("Queue Size is "+queue.size());
		queue.dequeue();
		queue.dequeue();
		if(queue.isEmpty()){
			System.out.println("Queue is Empty!");
		}else
		{
			System.out.println("Queue is Not Empty!");	
		}
	}
}