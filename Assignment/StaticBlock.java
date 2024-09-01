/*
 * Static Block : 1) used to int static variable
 * 				  2) it will exicuted before the default constructor
 * 				  3)
 */
public class StaticBlock {
	int section;
	static int srNo;
	static {
		System.out.println("---------This Is A Static Block----------");
		srNo = 500;
	}
	
	public StaticBlock() {
		srNo++;
		section++;
	}
	
	static void display() {
		System.out.println("\nsrNo : " + srNo);
	}


	public String toString() {
		return "[ section : " + section + "\tsrNo : " + srNo + " ]";
	}

	public static void main(String[] args) {
		
		StaticBlock s1 = new StaticBlock();
		
		StaticBlock s2 = new StaticBlock();
		
		System.out.println(s1);
		System.out.println(s1);
//		s1.display();
		s2.display();
		
	}

}
