
public class Practice_01 {

	public static void main(String[] args) {
		
		wordlist[] book;
		book = new wordlist[26];
		for(char i ='a';i<='z';i++)		// wordlist의 alpha 초기화
		{
			book[(int)(i-'a')].Alpha = i; 
		}
		String input = "abdc";
		while(true)						// 입력문자의 분류
		{
			if(input.length() == 1)		// 1차 분류 -> 입력된 단어가 단 1개짜리 알파벳일때
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
			else						// 2차 분류 -> 입력된 단어가 1개짜리가 아닌 경우
			{
				for(int i=0;i<=25;i++)	// 입력된 단어의 첫 글자와 일치하는 알파벳 찾기 반복
				{
					if(input.charAt(0) == book[i].Alpha)	// 입력된 단어의 첫 글자와 알파벳이 일치 할 경우
					{
						words test = book[i].head;			// 새로운 분기 발생: book[i]의 head가 null일때 or아닐때
						
						if(test == null)					// head의 참조 test가 null일때는 head 자체가 널이거나 리스트의 끝단 일 경우 
						{
							test = new words(input);		
							test.next = null;
							test = test.next;
						}
						
						else
						{
							System.out.println("ddiyong~");
							System.out.println("왜안돼");
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

class words // 상위클래스에서 분류된 이니셜알파벳을 가진 단어들의 리스트
{
	String word;
	int count = 0;
	words next = null;
	public words (String word)
	{
		this.word = word;
	}
}