class NLArray_3
{
	//method that checks same consecutive values
	public static boolean NConRep(int[][] array){
		boolean bool = false;
		for(int i=0; i<4; i++){
			int n=1;
			for(int j=0; j<3; j++){
				if(array[i][j] == array[i][j+1]){
					n++;
					if(n==4){
						bool = true;
						break;
					}
				}
				
			}
		}
		return bool;
	}
	
	//main method
	public static void main(String arg[])
	{
		
		int[][] arr = {
						{2, 1, 3, 5},
						{2, 2, 2, 2},
						{1, 4, 8, 5},
						{5, 8, 7, 4}
					  };
		
		//checking the array
		boolean res = NConRep(arr);
		System.out.println(res);
	}
}