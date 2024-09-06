
class Calculation{
	int calcArea(int l,int b) {
		return l*b;
	}
}

class Reactangle
{
	Calculation cal; // use of aggregation while creating objOf one class other
	String name;
	int area(int l,int b) {
		cal = new Calculation();
		return cal.calcArea(l, b);
	}
}

public class Aggrigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reactangle rect = new Reactangle();
		System.out.println("Area of rectangle : "+ rect.area(10, 20));
		}

}
