class Node
{
	String name;
	Node next;
	//constrictor
	Node(String name)
	{
		this.name = name;
		this.next = null;
	}
}
class List
{	
	Node head;
	//at at beg
	void addAtBeg(String name){
		Node newNode = new Node(name);
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
	void addAtEnd(String name){
		Node newNode = new Node(name);
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
			int no = 1;
			while(curr != null)
			{
				System.out.println(no+". "+curr.name+" ");
				curr = curr.next;
				no++;
			}
		}
	}
	//playSongs
	void playSongs(char k, int N, Node head)
	{
		Node curr = head;
		while(curr != null){
			if(curr.name.charAt(0) == k)
			{
				for(int i=0; i<N; i++){
					System.out.println(curr.name);
				}
			}
			else
			{
				System.out.println(curr.name);	
			}
		curr = curr.next;
		}
	}	
}
class Main
{
	public static void main (String arg[])
	{	
		List PlayList = new List();
		PlayList.addAtBeg("Tum se milna!");
		PlayList.addAtBeg("Dil ne yeh kaha dil se!");
		PlayList.addAtBeg("Shayad!");
		PlayList.addAtBeg("Mohabat Ki jhooti Kahani!");
		PlayList.addAtBeg("O Mere Sanam!");
		PlayList.addAtBeg("Kya Se Kya Ho Gaya!");
		PlayList.addAtBeg("Gulabi Ankhen Jo Teri!");
		PlayList.addAtBeg("Beshaq Mandir Masjid!");
		System.out.println("List of Songs: ");
		System.out.println("--------------");
		PlayList.print();
		System.out.println("Songs are Playing:");
		System.out.println("------------------");
		PlayList.playSongs('S',5,PlayList.head);
	}
}