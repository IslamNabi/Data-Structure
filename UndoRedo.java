import java.util.Scanner;
class Node
{
	String data;
	Node next;
	//
	Node(String data){
		this.data = data;
		this.next = null;
	}
}
class UndoRedo 
{	
	Node head = null;
	
	void insert(String data){
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
	
	void remove(){
		if(head == null){
			System.out.println("List is Empty!");
		}
		else
		{
			head = head.next; 
			
		}
	}
	
	void print(){
		if(head == null){
			System.out.println("List is Empty!");
		}
		else
		{
			Node cur = head;
			while(cur != null){
				System.out.print(cur.data+" ");
				cur = cur.next;
			}
		}
	}
	public static void main(String arg[])
	{
		UndoRedo OList = new UndoRedo();
		UndoRedo UndoList = new UndoRedo();
		Scanner sc = new Scanner(System.in);
		Boolean bool = true;
		while(bool)
		{
			System.out.print("Enter Your Choise: ");
			int choise = sc.nextInt();
			if(choise == 1){
				System.out.print("Enter Data: ");
				String input = sc.next();
				OList.insert(input);
			}
			else if(choise == 2){
				if(OList.head != null){
				UndoList.insert(OList.head.data);
				OList.remove();
				System.out.println("Undo Successfull:");
				}
				else
				{
					System.out.println("Undo is not possible!:");
				}
			}
			else if(choise == 3){
				if(UndoList.head != null){
				System.out.println("Redo Successfull:"+""+UndoList.head.data);
				OList.insert();
				UndoList.remove();
				}else{
					System.out.println("Redo is Not Possible!:");
				}
			}
			else if(choise == 4){
				OList.print();
			}
			else if(choise == 5){
					bool = false;
			}	
		}
	}
}