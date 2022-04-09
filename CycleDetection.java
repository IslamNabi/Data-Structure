import java.util.Scanner;

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
	//has cycle method
	boolean hasCycle(){
		if(head == null){
			return false;
		}
		Node slow = head;
		Node fast = head;
		while(true){
		slow = slow.next;
		if(fast.next != null){
			fast = fast.next.next;
		}
		else
			return false;
		
		if(slow == null || fast == null){
			return false;
		}
		
		if(slow == fast){
			return true;
		}
		}
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
class CycleDetection
{
	public static void main (String arg[])
	{
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size of List: ");
		int size = sc.nextInt();
		int i=0;
		System.out.println("Enter "+size+" Elements of List: ");
		while(i<size){
			int input = sc.nextInt();
			list.insertAtEnd(input);
			i++;
		}
		System.out.println("List is: ");
		list.printList();
		System.out.println("\nDo you want to create Cycle(y/n): ");
		char ans = sc.next().charAt(0);
		if(ans=='y'){
			System.out.println("Enter Position to Create Cycle: ");
			int position = sc.nextInt();
			Node posNode = null;
			Node curr = list.head;
			int count =1;
			
			while(curr != null){
				
				if(count == position){
					posNode = curr;
					break;
				}
				else
				{
					count++;
					curr = curr.next;
				}
			}
			
			Node node = list.head;
			while(node.next != null){
				node = node.next;
			}
			node.next = posNode;
			System.out.println("Cycle Exists: ");
			System.out.println(list.hasCycle());
			
		}
		else
		{
			System.out.println("Cycle Does Not Exist: ");
		}	
	}
}