import java.util.*;
public class Count {
	String str;
	public Count(String str) {
		this.str = str;
	}
	public void countVowelsConsonunts() {
		int vowels = 1;
		int consonunts = 1;
		for(int i = 0; i < this.str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowels += 1;
			}else {
				consonunts +=1;
			}
		}
		System.out.println("No of Vowels : " + vowels);
		System.out.println("No of Consonunts : " + consonunts);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.next();
		Count count = new Count(str);
		count.countVowelsConsonunts();
	}

}
