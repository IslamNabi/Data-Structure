import java.util.Scanner;
//creating Node class
class Node{
	int data;
	Node next;
	//contructor
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
//creating list class
class LinkedList
{
	//creating head
	public static Node head=null;
//method that add value to list
	void add(int data){
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
			//newNode.next = head;
		}
	}
	
//method that checks cycle in list
	boolean hasCycle(Node head){
		if(head == null){
			return false;
		}
		//creating two refernces to the list
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
// method to print
	void printList(){
		Node node = head;
		if(node == null){
			System.out.println("List is Empty!");
		}else{
			
			while(node.next != null){
				System.out.print(node.data+" ");
				node = node.next;
			}
			System.out.print(node.data);
		}
	}	
	//main method
	public static void main (String arg[]){
	Scanner sc = new Scanner(System.in);
	LinkedList list = new LinkedList();
	System.out.println("Enter Size of List: ");
	System.out.println("-------------------------------");
	int size = sc.nextInt();
	int i=0;
	System.out.println("\nEnter "+size+" Elements of List: ");
	System.out.println("-------------------------------");
	while(i<size){
		int node = sc.nextInt();
		list.add(node);
		i++;
	}
	System.out.println("\nList: ");
	System.out.println("-------------------------------");
	list.printList();
	System.out.println();
	System.out.println("\nEnter Position to create Cycle: ");
	System.out.println("---------------------------------");
	int pos = sc.nextInt();
	int position=0;
	
	if(pos > 0 && pos<size){
		position = pos;	
	}
	else{
		System.out.println("\tPosition out of List! ");
		System.exit(0);
	}
	int count = 0;
	Node myNode = head;
	Node temp = null;
	while(myNode.next != null){
		count++;
		if(count == position){
			temp = myNode;
			break;
		}
	}
	while(myNode.next != null){
		myNode = myNode.next;
	}
	myNode.next = temp;
	
	System.out.println("\nCheck wether list contains a cycle or not: ");
	System.out.println("---------------------------------");
	boolean res = list.hasCycle(head);
	if(res == true){
	System.out.println("Cycle Exists!");
	}
	else
		System.out.println("Cycle does not Exist!");	
}
}