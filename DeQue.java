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
	Node head;
	//add at beg
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
	
	//add at end
	public void insertAtEnd(int data){		//1
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
	}
	
	//remove from beg
	void deleteFromBeg(){
		if(head == null){
			System.out.println("List is Empty!");
		}
		else
		{
			head = head.next;
		}
	}
	
	//remove from end
	void deleteFromEnd(){
		Node curr = head;
		if(head == null){
			System.out.println("List is Empty!");
		}
		else
		{
			while(curr.next.next != null){	
				curr = curr.next;
			}
			curr.next = curr.next.next;	
		}
	}
	
	//print list
	public void printList(){
		Node node = head;		//10
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
class DeQue
{
	public static void main(String arg[])
	{
		LinkedList list = new LinkedList();
		list.insertAtBeg(10);
		list.insertAtBeg(20);
		list.insertAtBeg(30);
		list.insertAtBeg(40);
		list.insertAtEnd(50);
		list.insertAtEnd(60);
		list.insertAtEnd(70);
		list.printList();
		list.deleteFromBeg();
		System.out.println();
		list.printList();
		list.deleteFromEnd();
		System.out.println();
		list.printList();
	}
}