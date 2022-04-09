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
class LinkedList
{
	//creating head
	public static Node head;
	//creating method to add values in list at the end
	public void insertAtEnd(int data){
		//creating a node
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else
		{
			Node last = head;
			while(last.next != null){
				last = last.next;
			}
			last.next = newNode;
		}
	}//end of this method
	
	//creating method to add values in list at the beg of list
	public void insertAtBeg(int data){
		//creating a node
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else
		{
			newNode.next=head;
			head = newNode;
		}
	}
	
	//creating a method that deletes an object with given value
	public void deleteGivenValue(int value){
		Node node = head;
		while(node.next != null){
			if(node.next.data == value){
				node.next = node.next.next;
				break;
			}
			node = node.next;
		}
		
	}
	
	//creating a method for searching a value in list
	public boolean searchValue(int value){
		boolean bool = false;
		Node node = head;
		while(node.next != null){
			if(node.data==value)
				bool = true;
			node = node.next;
		}
		if(node.data==value)
			bool=true;
		return bool;
	}
	//reverse a list
	Node reverseList(Node head){
		Node curr, prev = null, next;
		curr = head;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;	// 1 2 3
		}
		head = prev;
		return head;
	}
	//print list
	public void printList(){
		Node node = head;
		if(node == null){
			System.out.println("List is Empty!");
		}
		else
		{
			while(node.next != null){
				System.out.print(node.data+" ");
				node = node.next;
			}
			System.out.print(node.data);
		}
	}
}
//main class	
class ReverseLinkedList
{
	public static void main (String arg[]){
	Stack stack = new Stack(4);	
	LinkedList list = new LinkedList();
	list.insertAtEnd(1);
	list.insertAtEnd(2);
	list.insertAtEnd(3);
	list.insertAtEnd(4);
	System.out.println("Original List: ");
	list.printList();
	Node head2 = list.reverseList(list.head);
	Node curr= head2;
	System.out.println();
	System.out.println("Reversed List: ");
	while(curr.next != null){
		System.out.print(curr.data+" ");
		curr = curr.next;
	}
	System.out.println(curr.data);
	}
}
