class Node
{
	int data;
	Node next;
	//constrictor
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class List
{	
	Node head;
	//at at beg
	void addAtBeg(int data){
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	//at at End
	void addAtEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else
		{
			Node curr = head;
			while(curr.next != null){
				curr  = curr.next;
			}
			curr.next = newNode;
		}
	}	
	//print
	void print(){
		if(head == null)
		{
			System.out.print("List is Empty!");
		}
		else
		{
			Node curr = head;
			
			while(curr != null)
			{
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
	}
	//move doubles
	void moveDoubles(List list){
		Node cur = list.head;
		List dList = new List();
		List sList = new List();

		while(cur != null)
		{
			if((cur.data > 9 && cur.data<=99)){
				dList.addAtEnd(cur.data);
			}
			else{
				sList.addAtEnd(cur.data);
			}
			cur = cur.next;
		}
		
		Node temp = sList.head;
		while(temp!=null){
			dList.addAtEnd(temp.data); 
			temp = temp.next;
		}	
		dList.print();
	}
			
}
class MoveDoubles
{
	public static void main(String arg[])
	{
		List list = new List();
		list.addAtEnd(1);	
		list.addAtEnd(2);	
		list.addAtEnd(12);
		list.addAtEnd(3);
		list.addAtEnd(15);
		list.addAtEnd(4);
		list.addAtEnd(16);
		//list.print();
		list.moveDoubles(list); 	// 12 15 16 1 2 3 4
	
	}
}