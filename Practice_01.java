
public class Practice_01 {

	public static void main(String[] args) {
		Wordlist WL = new Wordlist();
		WL.init_class();
		for(Wordlist i = WL.head;i == null ;i = i.Alpha)
		{
			System.out.println(i.word);
		}

	}

}

class Wordlist
{
	String word;
	Wordlist next;
	Wordlist Alpha;
	
	void init_class(Wordlist node)
	{
		for(String i = "a";i.equals("z");i+=1)
		{
			node.word = i;
			node = node.Alpha;
		}
	}
	void add (String word)
	{
		
	}
}