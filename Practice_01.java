
public class Practice_01 {

	public static void main(String[] args) {
		
		wordlist[] book;
		book = new wordlist[26];
		for(char i ='a';i<='z';i++)		// wordlist�� alpha �ʱ�ȭ
		{
			book[(int)(i-'a')].Alpha = i; 
		}
		String input = "abdc";
		while(true)						// �Է¹����� �з�
		{
			if(input.length() == 1)		// 1�� �з� -> �Էµ� �ܾ �� 1��¥�� ���ĺ��϶�
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
			else						// 2�� �з� -> �Էµ� �ܾ 1��¥���� �ƴ� ���
			{
				for(int i=0;i<=25;i++)	// �Էµ� �ܾ��� ù ���ڿ� ��ġ�ϴ� ���ĺ� ã�� �ݺ�
				{
					if(input.charAt(0) == book[i].Alpha)	// �Էµ� �ܾ��� ù ���ڿ� ���ĺ��� ��ġ �� ���
					{
						words test = book[i].head;			// ���ο� �б� �߻�: book[i]�� head�� null�϶� or�ƴҶ�
						
						if(test == null)					// head�� ���� test�� null�϶��� head ��ü�� ���̰ų� ����Ʈ�� ���� �� ��� 
						{
							test = new words(input);		
							test.next = null;
							test = test.next;
						}
						
						else
						{
							System.out.println("ddiyong~");
							System.out.println("�־ȵ�");
						}
						
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