class Node 
{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList
{
//creating list and its head
	Node head;
	//creating method to add values in list at the end
	void insertAtEnd(int data){
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
	void insertAtBeg(int data){
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
	void deleteGivenValue(int value){
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
	boolean searchValue(int value){
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

	//print list
	void printList(){
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
class EvenOddLists
{
	public static void main(String arg[]){
		LinkedList originalList = new LinkedList();
		LinkedList evenList = new LinkedList();
		LinkedList oddList = new LinkedList();
		
		originalList.insertAtEnd(1);
		originalList.insertAtEnd(2);
		originalList.insertAtEnd(3);
		originalList.insertAtEnd(4);
		originalList.insertAtEnd(5);
		originalList.insertAtEnd(6);
		originalList.insertAtEnd(7);
		System.out.println("Original List: ");
		originalList.printList();
		
		Node curr = originalList.head;
		while(curr.next != null){
			if(curr.data%2 == 0)
			{
				evenList.insertAtEnd(curr.data);
				curr = curr.next;
			}
			else
			{
				oddList.insertAtEnd(curr.data);
				curr = curr.next;
			}
		}
		System.out.println("\nEven: ");
		evenList.printList();
		System.out.println("\nOdd: ");
		oddList.printList();
	}
}
	