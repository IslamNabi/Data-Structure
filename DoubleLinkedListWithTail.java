//creating a Node class
class Node 
{
	int data;
	Node prev, next;
	//constructor
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
//creating a DoubleLinkedList with a tail
class DoubleLinkedListWithTail
{
	
	//creating a head and a tail of list
	public static Node head;
	public static Node tail;
	
	//a method that add value at begining
	void addAtBeg(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next  = head;
		}	
		else{
			head.prev = newNode;
			head.prev.next = head;
			head = newNode;
			tail.next = head;
			
		}	
	}
	//a method that add value at end
	void addAtEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = head;
		}
		
		
	}
	
	//a method that remove value from begining
	void removeFromBeg(){
		if(head == null){
			System.out.println("List is Empty!");
		}else
		{
			head = head.next;
			head.prev = null;
			tail.next = head;
		}
	}
	
	//a method that remove value from ending
	void removeFromEnd(){
		if(head == null){
			System.out.println("List is Empty!");
		}else
		{
			tail = tail.prev;
			tail.next = head;
		}
	}
	//print list
	void printList(){
		Node node = head;
		while(node.next != head ){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data);
	}

	//main method
	public static void main(String arg[]){
		DoubleLinkedListWithTail list = new DoubleLinkedListWithTail();
		//inserting values at the begining of list
		System.out.println("Insert Values at the Begining: ");
		System.out.println("------------------------------");
		list.addAtBeg(1);
		list.addAtBeg(2);
		list.addAtBeg(3);
		list.addAtBeg(4);
		list.addAtBeg(5);
		System.out.println("List:");
		list.printList();
		System.out.println();
		//inserting values at the end of list
		System.out.println("\nInsert Values at the End: ");
		System.out.println("------------------------------");
		list.addAtEnd(6);
		list.addAtEnd(7);
		list.printList();
		System.out.println();
		//removing values from begining of list
		System.out.println("\nRemove from begining: ");
		System.out.println("------------------------------");
		list.removeFromBeg();
		list.removeFromBeg();
		System.out.println("List:");
		list.printList();
		System.out.println();
		//removing values from end of list
		System.out.println("\nRemove from End: ");
		System.out.println("------------------------------");
		list.removeFromEnd();
		list.removeFromEnd();
		System.out.println("List:");
		list.printList();
		System.out.println();
		
	}
}
