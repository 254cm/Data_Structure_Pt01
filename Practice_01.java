
public class Practice_01 {

	public static void main(String[] args) {
		Wordlist Head = new Wordlist();
		init_class(Head);
		for(Wordlist i = Head;i == null ;i = i.Alpha)
		{
			System.out.println(i.word);
		}

	}
	
	static void init_class(Wordlist node)
	{
		for(String i = "a";i.equals("z");i+=1)
		{
			node.word = i;
			node.Alpha = new Wordlist();
			node = node.Alpha;
		}
	}

}

class Wordlist
{
	String word;
	Wordlist next;
	Wordlist Alpha;
	
	void add (String word)
	{
		
	}
}