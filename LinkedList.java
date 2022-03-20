//creating Node class
class Node{
		int data;
		Node next;
		//Node constructor
		Node(int data){
			this.data = data;
		}
	}
	
interface list
{ 
	// returns true if the list is empty, false otherwise
	public boolean isEmpty(); 
	
	// returns the number of items in the list 
	public int size();
	
	// adds an item to the list
	// item is added at the end of the list 
	public void add(Node node); 
	
	// adds an item to the list at the given index 
	// item is added at the given index; 
	// the indices start from 1.
	public void add(int index, int item); 
	
	// removes the item from the list that has the given index
	public void remove(int index); 
	
	// removes an item from the list 
	// removes the first item in the list whose equal method matches 
	// that of the given item
	public void remove(Node node);
	
	// creates a duplicate of the list 
	// returns a copy of the linked list
	//public List duplicate();
	
	// creates a duplicate of the list with the nodes in reverse order 
	// returns a copy of the linked list with the nodes in reverse order
	//public List duplicateReversed(); 
}

class LinkedList implements list
{
	
	//creating head and tail of List
	public  Node head = null;
	public  Node tail = null;

	public int size;
	//constructor
	public LinkedList(){
		size = 0;
	}
	
	//method that add node at the end of list
	public void add(Node newNode){
		if(head == null){
			head = newNode;
			tail = newNode;
			newNode.next = head;
			size++;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next=head;
			size++;
		}
	}
	//method to display
	public void printList(){
		Node current = head;
		if(head == null){
			System.out.println("List is Empty");
		}
		else
		{
			do{
				System.out.print(current.data+" ");
				current = current.next;
			
			}while(current != head);
		}
	}

	
	//override isEmpty() method of List interface
	public boolean isEmpty(){
		return size == 0;
	}
	
	//override size() method of List interface
	public int size(){
		return size;
	}
	
	//override remove(int index) methhod of List interface
	public void remove(int index){
		Node node = head;
		int count=1;
		if(index == 1){
			head = tail.next.next;
			tail.next = head;
			size--;
		}
		else{
			while(node.next != head){
				count++;
				if(count == index){
				node.next = node.next.next;	
				size--;
				break;
				}
				node=node.next;
			}
		}	
	}
	
	//override remove(int index) methhod of List interface
	public void add(int index, int item){
		Node newNode = new Node(item);
		int count = 1;
		Node node = head;
		if(index == 1){
			newNode.next = head;
			head = newNode;
			tail.next=head;
		}
		else
		{
			while(node.next!=head){
				count++;
				if(count == index){
				node.next.data = newNode.data;
					break;
				}
				node = node.next;
			}
		}
	}
		
	//override remove(Node node) methhod of List interface
	public void remove(Node node){
		Node temp = head; 
		if(head.data == node.data){
			head = head.next;
			tail.next = head;
		}
		else{
		do{
			if(temp.next.data == node.data){
				temp.next = temp.next.next;
				size--;
				break;
			}
			temp = temp.next;
			
		}while(temp != head);
		}
	}
	
	//main method
	public static void main (String arg[])
	{
		//creating a list
		LinkedList list = new LinkedList();
		//creating nodes
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		
		//adding nodes in the list
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		list.add(node6);
		list.add(node7);
		list.add(node8);
		list.add(node9);
		list.add(node10);

		//display list 
		System.out.println("->Nodes of List: ");
		list.printList();
		System.out.println();
		//checking weather list is empty or not
		System.out.println();
		System.out.println("->Checking weather list is Empty or Not");
		System.out.println(list.isEmpty());
		//finding size of list
		System.out.println();
		System.out.println("->Size of List: ");
		System.out.println(list.size());
		//Deleting item at particuler index
		System.out.println();
		System.out.println("->Deleting an item at a particuler index in List: ");
		System.out.println("->Delete item at index: "+3);
		list.remove(3);
		list.printList();
		//Adding a node at particuler index
		System.out.println();
		System.out.println("\n->Adding a Node at a particuler index in List: ");
		System.out.println("->Adding 11 at index 8: ");
		list.add(8,11);
		list.printList();
		//deleting a given value from list
		System.out.println();
		System.out.println("\n->Deleting a given Value from List: ");
		System.out.println("->Delete 2 from List: ");
		list.remove(node2);
		list.printList();
	}
}