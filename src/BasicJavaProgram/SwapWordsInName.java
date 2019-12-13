package BasicJavaProgram;


public class SwapWordsInName {

	public static void SwapName(String s) {
		String f = null;
		String l = null;
		String word[] = s.split(" ");
		if (word.length < 3) {
			for (int i = 0; i < word.length; i++) {
				if (i == 0)
					f = word[i];
				else if (i > 0)
					l = word[i];
			}
			System.out.println(l + " " + f);
		}
	}
	// public static void SwapName(String n)
	// {
	// System.out.println("Before Swap:\n"+n);
	// String firstName=n.substring(0,n.indexOf(" "));
	// String lastName=n.substring(n.indexOf(" "));
	// System.out.println("After Swap:\n"+lastName+" "+firstName);
	// }

	public static void main(String[] args) {
		SwapName("Ankur Ghosh");

	}
}
