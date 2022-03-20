import java.io.*;

class NLArray
{
	public static String[] wordTokenize(String fileName){
		String[] arr = fileName.split(" ");
		return arr;	
	}
	
	public static String[] extractEmails(String fileName){
		String[] arr = fileName.split(" ");
		return arr;
	}
	
	public static void main(String arg[])
	{
		try{
			FileReader reader = new FileReader("File.txt");
			int data = reader.read();
			String file="";
			while(data != -1){
				file += (char)data;
				data = reader.read();
			}
			reader.close();
			System.out.println();
			System.out.println("List of Words: ");
			System.out.println("--------------");
			String[] words = wordTokenize(file);
			for(String s : words){
					if(s.contains(".")|| s.contains(",") || s.contains(":"))
					continue;
					else
						System.out.println(s);
			}
			System.out.println();
			System.out.println("List of Email Addresses: ");
			System.out.println("------------------------");
			String[] emails = extractEmails(file);
			for(String e : emails){
				if(e.contains(".") && e.contains("@") || e.contains("-") )
					System.out.println(e);
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
}