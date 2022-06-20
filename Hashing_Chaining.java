import java.util.*;
class Hashing_Chaining 
{
	private ArrayList<Integer>[] arr;
	private int size;
	
	//constructor
	Hashing_Chaining(int size){
		arr = new ArrayList[size];
		this.size = size;
	}
	
	//insert method with chaining technique to prevent data collision
	void insertValue(int val){
		int index = val%size;
		arr[index].add(val);
	}
	//display arr
	void print(){
		for(int i=0; i<size; i++){
			System.out.println("Index "+i+" of Array:");
			for(int j=0; j<arr[i].size(); j++){
				System.out.print(arr[i].get(j)+" ");
			}
			System.out.println();
		}
	}
	
	//find 
	
	
	//main method
	public static void main(String arg[])
	{
		Hashing_Chaining hashTable = new Hashing_Chaining(3);
		hashTable.insertValue(0);
		hashTable.insertValue(10);
		hashTable.insertValue(20);
		hashTable.insertValue(1);
		hashTable.insertValue(11);
		hashTable.insertValue(21);
		hashTable.insertValue(2);
		hashTable.insertValue(12);
		hashTable.insertValue(22);
		hashTable.insertValue(3);
		hashTable.insertValue(13);
		hashTable.insertValue(23);
		hashTable.print();

	}
}