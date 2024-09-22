/*
 * Accept the character to find out whether the given character is a 
 * digit or a character or a special simbole
 */
public class Assignment3 {
	char ch;
	public Assignment3(char ch) {
		this.ch = ch;
	}
	public String validateCharacter() {
//		int no = (int)(ch);
//		System.out.println(no);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			return "It is a Character";
		else if(Character.isDigit(ch))
			return "It is a Digit";
		else
			return "It is a Special Symbole";
	}
	public static void main(String[] args) {
		Assignment3 a = new Assignment3('A');
		System.out.println(a.validateCharacter());
	}

}
