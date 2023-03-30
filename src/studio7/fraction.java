package studio7;

public class fraction {
	int num;
	int den;
	public fraction(int n, int d) {
		this.num = n;
		this.den = d;
	}
	
	public String sum(fraction f) {
		int comDenom = this.den*f.den;
		int newNum = (this.den*f.num) + (this.num*f.den);
		return newNum + "/" + comDenom;
		
	}
	public String simplify(fraction f) {
		
		for (int i = 2, i <= this.den; i++) {
			if(this.num%i != 0 && this.den%i != 0) {
				num = this.num/i;
				den = this.den/i;
			}	
		}
		
		return;
		
	}
	
	
	public static void main(String args[]) {
		
		fraction f = new fraction(1, 4);
		fraction f2 = new fraction(1, 2);
		System.out.println(f.sum(f2));
	}
}
