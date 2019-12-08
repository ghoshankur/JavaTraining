package BasicJavaProgram;

import java.util.HashMap;
import java.util.Map;

public class SwapWordsInName {

	public static void SwapName(String s)
	{
		String b = null;
		String w = null;
		String word[]=s.split(" ");
		//Map<String,Integer> Count= new HashMap<String,Integer>();
		for(int i=0;i<word.length;i++)
		{
		 	if(i==0)
		 		w=word[i];
		 	else if(i>0)
		 		b=word[i];		
		}
		System.out.println(b+" "+w);
	}
	public static void main(String[] args) {
		SwapName("Ankur Ghosh");

	}

}
