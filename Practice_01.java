
public class Practice_01 {

	public static void main(String[] args) {
		
		wordlist[] book;
		book = new wordlist[26];
		for(char i ='a';i<='z';i++)		// wordlist�� alpha �ʱ�ȭ
		{
			book[(int)(i-'a')].Alpha = i; 
		}
		String input = "abdc";
		while(true)
		{
			if(input.length() == 1)
			{
				for(int i = 0;i<=25;i++)
				{
					if(input.equals(Character.toString(book[i].Alpha)))
					{
						book[i].count++;
						break;
					}
				}
			}
			else
			{
				for(int i=0;i<=25;i++)
				{
					if(input.charAt(0) == book[i].Alpha)
					{
						
					}
				}
			}
		}
	}
}

class wordlist
{
	char Alpha;
	int count = 0;
	words head = null;
	
	void add (String word)
	{
		
	}
}

class words // ����Ŭ�������� �з��� �̴ϼȾ��ĺ��� ���� �ܾ���� ����Ʈ
{
	String word;
	int count = 0;
	words next = null;
	public words (String word)
	{
		this.word = word;
	}
}