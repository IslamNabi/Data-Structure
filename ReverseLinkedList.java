//creating Node class
class Node
{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class ReverseLinkedList
{
	//creating head of list
	Node head = null;
	//Adding values at the end
	void addAtEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
		head = newNode;
		}
		else
		{
			Node curr = head;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}
	//add at beg
	void addAtBeg(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	//print list method
	void print(){
		Node curr = head;
			while(curr.next != null){
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			System.out.print(curr.data);
	}
	public static void main(String arg[])
	{
		ReverseLinkedList list = new ReverseLinkedList();
		list.addAtEnd(1);
		list.addAtEnd(2);
		list.addAtEnd(3);
		list.addAtEnd(4);
		list.print();
		
		ReverseLinkedList rlist = new ReverseLinkedList();
		Node curr = list.head;
		while(curr.next != null){
			rlist.addAtBeg(curr.data);
			curr = curr.next;
		}
		rlist.addAtBeg(curr.data);
		System.out.println();
		rlist.print();
	
	
	}
}