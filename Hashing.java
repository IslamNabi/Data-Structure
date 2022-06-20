class Hashing 
{
	private int[] arr;
	private int size;
	
	//constructor
	Hashing(int size){
		arr = new int[size];
		this.size = size;
		for(int i=0; i<size; i++){
			arr[i] = -1;
		}
	}
	
	//insert method with lenear probing technique to prevent data collision
	void insertValue(int val){
		int index = val%size;
		if(arr[index] == -1){
		arr[index] = val;
		}
		else{
		
			for(int i=index; i<size; i++){
				if(arr[i] == -1){
					arr[i] = val;
					break;
				}
			}
		}
	}
	//display arr
	void print(){
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	//find 
	boolean find(int val){
		int index = val%size;
		if(arr[index] == val){
			return true;
		}	
		else
			return false;
	}
	
	//main method
	public static void main(String arg[])
	{
		Hashing hashTable = new Hashing(15);
		hashTable.insertValue(0);
		hashTable.insertValue(1);
		hashTable.insertValue(2);
		hashTable.insertValue(3);
		hashTable.insertValue(4);
		hashTable.insertValue(5);
		hashTable.insertValue(6);
		hashTable.insertValue(7);
		hashTable.insertValue(8);
		hashTable.insertValue(9);
		hashTable.insertValue(10);
		hashTable.insertValue(20);
		hashTable.insertValue(12);
		hashTable.print();
		System.out.println("\n"+hashTable.find(5)+" "+hashTable.find(11));
	}
}