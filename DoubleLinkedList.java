//creating a Node class
class Node{
	String name;
	Node next;
	Node prev;
	//constructor
	public Node(String name){
		this.name = name;
		this.next = null;
		this.prev = null;
	}
}
//creating a LinkedList class
class DoubleLinkedList{
	//creating head of list
	public static Node head = null;
	
	//method that insert node at the end
	public void insertAtBeginning(String name){
		Node newNode = new Node(name);
		if(head == null){
			head = newNode;
		}
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	// Add node in beginning of linkedlist, node as param 
	void insertAtBeginning(Node newNode){
		if(head == null){
			head = newNode;
		}
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}	
	}
	
	// Add node in end of linkedlist, name as param  
	void insertAtEnd(String name){
		Node newNode = new Node(name);
		if(head == null){
			head = newNode;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			temp.next.prev = temp;
		}
	}
	
	// Add node in end of linkedlist, node as param  
	void insertAtEnd(Node newNode){
		
		if(head == null){
			head = newNode;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			temp.next.prev = temp;
		}
	}
	//method that print DoubleLinkedList
	public void printList(){
		Node node = head;
		if(head == null){
			System.out.println("List is Empty.");
		}
		else
		{
			while(node.next != null){
				System.out.print(node.name+" ");
				node = node.next;
			}
			System.out.print(node.name);
		}
	}
	
	// Add node after name which is provided as param , name and node as params  
	void insertAfterName(String name, Node node) {
		Node curr = head;
		if(head.name == name){
			head.next = node;
			head.next.prev = head;
		}else{
			while(curr.next != null){
				if(curr.name == name){
					Node temp = curr.next;
					curr.next = node;		// islam nabeel ahsan jazib
					curr.next.prev = curr;
					curr.next.next = temp;
					break;
				}
				curr = curr.next;
			}
		}	
	}
	
	// Add node before name which is provided as param , name and node as params
	void insertBeforeName(String name, Node node) {
		Node curr = head;
		if(head.name == name){
			head.prev = node;
			node.next = head;
			head = node;
		}else{
			curr = curr.next;
			while(curr.next != null){
				if(curr.name == name){
					Node temp = curr.prev; // hishmat islam asif parkash
					curr.prev = node;
					node.next = curr;
					node.prev = temp;
					temp.next = node;
					break;
				}
				curr = curr.next;
			}
		}	
	}
	
	// Make double linkedlist as Circular Double LinkedList
	public void makeCircular(){
		Node node = head;
		while(node.next != null){
			node = node.next;
		}
		node.next = head;
	}
	
	//main method
	public static void main(String arg[])
	{
		DoubleLinkedList list = new DoubleLinkedList();
		Node node1 = new Node("Islam");
		Node node2 = new Node("Nabeel");
		Node node3 = new Node("Ahsanullah");
		Node node4 = new Node("Asif");
		
		//inserting nodes at the begining 
		System.out.println("Inserting Nodes at the begining of list(string as param): ");
		System.out.println("---------------------------------------------------------");
		list.insertAtBeginning("Parkash");
		list.insertAtBeginning("Asif");
		list.insertAtBeginning("Noor");
		list.insertAtBeginning("Sarfiraz");
		//print list 
		System.out.println("List: ");
		list.printList();
		System.out.println();
		// Add node in beginning of linkedlist, node as param
		System.out.println("\nInserting Nodes at the begining of list(node as param): ");
		System.out.println("--------------------------------------------------------");
		list.insertAtBeginning(node1);
		list.insertAtBeginning(node2);
		list.insertAtBeginning(node3);
		//print list 
		System.out.println("List: ");
		list.printList();
		System.out.println();
		// Add node in end of linkedlist, name as param
		System.out.println("\nInserting Nodes at the End of list(String as param): ");	
		System.out.println("------------------------------------------------------");
		list.insertAtEnd("Khalid");
		list.insertAtEnd("Sajid");
		System.out.println("List: ");
		list.printList();
		System.out.println();
		// Add node in end of linkedlist, node as param
		System.out.println("\nInserting Nodes at the End of list(node as param): ");
		System.out.println("----------------------------------------------------");
		Node node5 = new Node("Babar");
		Node node6 = new Node("Zaheer");
		list.insertAtEnd(node5);
		list.insertAtEnd(node6);
		System.out.println("List: ");
		list.printList();
		System.out.println();
		// Add node after name which is provided as param , name and node as params
		System.out.println("\nInserting Nodes after given name in list(name and node as param): ");
		System.out.println("-------------------------------------------------------------------");
		Node node7 = new Node("Nizam");
		Node node8 = new Node("Santosh");
		list.insertAfterName("Noor", node7);
		System.out.println("List: ");
		list.printList();
		System.out.println();
		// Add node before name which is provided as param , name and node as params
		System.out.println("\nInserting Nodes before given name in list(name and node as param): ");
		System.out.println("-------------------------------------------------------------------");
		Node node9 = new Node("Hishmat");
		Node node10 = new Node("Saif");
		list.insertBeforeName("Islam", node9);
		System.out.println("List: ");
		list.printList();
		System.out.println();
		
		//make linkedlist list Circular
		System.out.println("\nCircular Double Linked List: ");
		System.out.println("Accessing Head from last node: ");
		list.makeCircular();
		Node node = head;
		while(node.next != head){
			node = node.next;
		}
		System.out.println(node.next.name);
		
	}
}