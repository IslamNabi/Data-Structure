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
	//remove duplicate in list

	public void removeDuplicate() {  
        //Node current will point to head  
        Node current = head, index = null, temp = null;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){  
                //Node temp will point to previous node to index.  
                temp = current;  
                //Index will point to node next to current  
                index = current.next;  
                  
                while(index != null) {  
                    //If current node's data is equal to index node's data  
                    if(current.data == index.data) {  
                        //Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node  
                        temp.next = index.next;  
                    }  
                    else {  
                        //Temp will point to previous node of index.  
                        temp = index;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
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
class DeletingDuplicate
{
	public static void main(String arg[]){
	LinkedList list = new LinkedList();
	list.insertAtEnd(1);
	list.insertAtEnd(2);
	list.insertAtEnd(3);
	list.insertAtEnd(4);
	list.insertAtEnd(2);
	list.insertAtEnd(5);
	System.out.println("Original List: ");
	list.printList();
	list.removeDuplicate();
	System.out.println("\nAfter Removing Duplicates: ");
	list.printList();
	}
}