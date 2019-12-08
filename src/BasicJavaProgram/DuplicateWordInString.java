package BasicJavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DuplicateWordInString {

	public static void findDuplicate(String s)
	{
		//Split	
		String word[]=s.split(" ");
		//Create Hash Map	
			Map<String,Integer> Count= new HashMap<String,Integer>();
			//Check each word in the given array "Word"
			for(String words:word)
			{
				//if word is present in the array
				if(Count.containsKey(words))
				{
					Count.put(words.toLowerCase(), Count.get(words)+1);
				}else
				{
					Count.put(words,1);
				}
			}
			//extract all the key of the map in Count
			Set<String> WordInString=Count.keySet();
			//Loop through all the words in the Count
			for(String words:WordInString)
			{
				if(Count.get(words)>1)
					System.out.println(words+" "+Count.get(words));
			}
			
	}
	public static void main(String[] args) {
		 
		String s="My name is Ankur, Ankur is a good boy";
		String clean = s.replaceAll("[, ;]"," ");  
		findDuplicate(clean);

	}

}
